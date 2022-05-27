# JavaCompiler_TINF2020

<img align="right" width="220" height="90" src="https://upload.wikimedia.org/wikipedia/de/thumb/1/1d/DHBW-Logo.svg/541px-DHBW-Logo.svg.png?20110626153129">

[![forthebadge made-with-java](https://forthebadge.com/images/badges/made-with-java.svg)](https://java.com/)
[![forthebadge](https://forthebadge.com/images/badges/built-with-love.svg)](https://www.youtube.com/watch?v=dQw4w9WgXcQ)

# Inhalt

- [Rollenverteilung](#Rollenverteilung)

- [Architektur](#Architektur)

- [Schnittstellen](#Schnittstellen)

- [Klassendiagram-Abstrakte-Syntax](#Klassendiagram-Abstrakte-Syntax)

- [Klassendiagram-Getyped-Abstrakte-Syntax](#Klassendiagram-Getyped-Abstrakte-Syntax)

- [Java-Records](#Java-Records)

- [Java-Pattern-Matching](#Java-Pattern-Matching)

- [Factory-Pattern](#Factory-Pattern)

- [Öffnen-des-Projektes-in-einer-IDE](#Öffnen-des-Projektes-in-einer-IDE)

- [Ausführen-des-Compilers](#Ausführen-des-Compilers)

- [Parser](#Parser)

- [Type-Checker](#Type-Checker)

- [Bytecode-Generator](#Bytecode-Generator)

- [Testing](#Testing)

- [Parser-Tests](#Parser-Tests)

- [Typ-Checker-Tests](#Typ-Checker-Tests)

- [Bytecode-Generator-Tests](#Bytecode-Generator-Tests)

- [Integration-Tests](#Integration-Tests)

- [Functional-Tests](#Functional-Tests)

# Rollenverteilung

+ Jonathan Schwab [@JDev2001](https://github.com/JDev2001) - Projektleiter & UML & Test:
+ Felix Wochele [@FelixWochele](https://github.com/FelixWochele) - Parser
+ Jan Perthel [@jan510](https://github.com/jan510) - Typechecker
+ Reinhold Jooß [@SuuyaaYeet](https://github.com/SuuyaaYeet) - Bytecode Generierung


# Architektur

In diesem Abschnitt werden die Schnittstellen, Klassenstrukturen und speziellen verwendeten Java-Features erklärt.

## III.Schnittstellen

- Parser

```java
getSyntaxTree(charStream:input):AbstractSyntax
```

- Type-Checker

```java
semantikCheck(input:AbstractSyntax):TypedAbstractSyntax
```

- Byte-Code-Generator:

```java
generateByteCode(input:TypedAbstractSyntax):Hashmap<String, byte[]>
```

##

##

## Klassendiagram-Abstrakte-Syntax

Die abstrakte Syntax wird vom Parser erzeugt.

![]("./Project/diagram.png)

## Klassendiagram-Getyped-Abstrakte-Syntax

Die getyped Abstrakte Syntax ist ähnlich aufgebaut wie die abstrakte Syntax. Jedoch werden alle Expressions und Statements um einen Typ erweitert.

![]("./Project/diagram_typed.png)

#

#

## Java-Records

Seit Version 17 werden von Java Record-Typen angeboten. Records dienen zur Speicherung von unveränderlichen Daten. Der Schreibaufwand von Code ist im Vergleich zu Klassen deutlich geringer. Des Weiteren besitzen Records Standardimplementierungen für die Methoden „hashCode&quot;, „equals&quot; und „toString&quot;. Diese Methoden können bei Bedarf aber zusätzlich implementiert werden. Records unterstützen keine Vererbung, erlauben es jedoch Schnittstellen zu implementieren. Ein Record kann wie Folgt definiert werden:

```java
record Data (int Id, Stringname) {}
```

Zum Entwickeln eines JavaCompilers bieten sich diese Recordtypen an. Der Parser generiert eine abstrakte Syntax, die nach Generierung unveränderlich ist. Dasselbe gilt für den Type-Checker. Darüber hinaus müssen einige Tests geschrieben werden, welche die abstrakte Syntax und die getypte abstrakte Syntax nachbilden und mit den Ergebnissen des Parsers bzw. Type-Checks abgleichen. Werden die Record-Typen für diese Datenstruktur verwendet, muss anders als bei Klassen die Methode „equals&quot; nicht von Hand implementiert werden, um Assertions mit JUnit durchzuführen zu können.

## Java-Pattern-Matching

Seit Java 17 wird eine einfache Form von Pattern Matching angeboten. In einem Switch-Case-Statement wird ein instanceof-Check mit direktem anschließenden Typecast durchgeführt. So kann ein Basistyp auf verschiedene Subtypen geprüft werden.

```java
voidCheck(Object o)
{
    switch (o) {

        caseString s:

            // {...}
            break;
        caseInteger i:

            //  {...}

            break;

        caseBoolean i:
            //  {...}
            break;
    }
}
```

Durch die Verwendung von Pattern Matching im Type-Check und Bytecode-Generator kann auf das Visitor-Pattern verzichtet werden.

## Factory-Pattern

Um Abhängigkeiten zu entkoppeln ohne aufwendige Frameworklösungen wie Dependency Injection zu verwenden, wird das Factory Pattern genutzt. Eine Factory Klasse bietet einen IParser, einen ISemanticChecker und einen ICodeGenerator an. Die Factory instanziiert diese Klassen, sobald diese angefordert werden. Zurückgegeben werden nur Referenzen auf die Schnittstellen und nicht die Implementierungen. So wird Austauschbarkeit der einzelnen Komponenten gewährleistet.

# Öffnen-des-Projektes-in-einer-IDE

Das erforderliche Sprachlevel zum Kompilieren des Java-Compilers ist die Preview-Version Java 17 oder Java 18 mit Unterstützung für Pattern-Matching for switch. Wird die neuste Version von IntelliJ verwendet, kann diese Einstellung in dem Fesnter „Project Structure&quot; vorgenommen werden: ![](RackMultipart20220527-1-9y4fb8_html_de761331209c5e39.png)

Bei anderen IDEs muss zustäzlich bei Gradle oder Maven das JVM Flag „--enable-preview&quot; gesetzt werden.

# Ausführen-des-Compilers

Der entwickelte Compiler kann mit „java -jar compiler.jar \&lt;\&lt;arg\&gt;\&gt;&quot; aufgerufen werden. Arg ist hierbei die Java Datei, die kompiliert werden soll. Der Compiler erzeugt anschließend eine .class Datei, welche den kompilierten Java-Bytecode enthält.

# Parser

Der Parser übersetzt Java-Quellcode in eine abstrakte Syntax. Hierfür wird der Parser Generator Antler verwendet. In einer separaten Datei (.g4-Datei) wird die Grammatik zum Parsen des Java-Quellcodes definiert. Aus der Grammatik werden Klassen generiert. Zur Übersetzung in die abstrakte Syntax werden verschiedene Adapter geschrieben, welche die abstrakte Syntax erzeugen und ggf. noch kleine Anpassungen vornehmen. So wird nach und nach ein Syntaxbaum aufgebaut.

Schnittstelle: getSyntaxTree(charStream:input):AbstractSyntax

# Type-Checker

Der Typchecker übersetzt die abstrakte Syntax in eine getyped abstrakte Syntax. Da es sich bei Java um eine statisch typisierte Programmiersprache handelt, müssen Typprüfungen zur Kompilierungszeit vorgenommen werden. Diese Überprüfungen sind nicht mit dem Parser-Generator möglich und müssen in einem separaten Schritt vorgenommen werden. Der Typ-Checker prüft mit Regeln aus der Vorlesung, ob der Code konsistent typisiert ist und leitet die Typen her.

Schnittstelle: semantikCheck(input:AbstractSyntax):TypedAbstractSyntax

# Bytecode-Generator

Der Bytecode-Generator übersetzt die typisierte abstrakte Syntax in Bytecode. Hierfür wird die Java-Bibliothek ASM verwendet. Der Abstrakte Syntaxbaum wird durchlaufen und mittels dem ASM ClassWriter daraus Bytecode generiert. Zurückgegeben wird eine Hashmap, wobei ein Eintrag aus dem Klassennamen und dem zugehörigen Bytecode besteht.

Schnittstelle: generateByteCode(input:TypedAbstractSyntax):Hashmap\&lt;String, byte[]\&gt;

# Testing

## Parser-Tests

Ein Text, der Java-Quellcode enthält wird durch den Parser in eine abstrakte Syntax übersetzt. Das Ergebnis des Parsers wird anschließend mit einer händisch nachgebildeten Datenstruktur der erwarteten abstrakten Syntax auf inhaltliche Gleichheit überprüft. Getestet werden alle denkbaren Szenarios.

## Typ-Checker-Tests

Eine händisch aufgebaute abstrakte Syntax wird dem Typ-Checker als Eingabe übergeben. Das Ergebnis ist eine getypte abstrakte Syntax. Diese getypte Abstrakte syntax wird mit einer händisch nachgebildeten Datenstruktur der erwarteten getyped abstrakten Syntax auf inhaltliche Gleichheit überprüft. Getestet werden alle denkbaren Szenarios.

## Bytecode-Generator-Tests

Über Java Reflection kann der generierte Bytecode getestet werden. Hierzu wird dieser über den ReflectionLoader eingelesen. Anschließend können die enthalten Klassen, deren Felder, Methoden und Konstruktoren zur Laufzeit untersucht werden. Außerdem können Methoden aufgerufen und das erwartete Ergebnis abgerufen werden. So kann der erwartete strukturelle einer Klasse geprüft werden. Außerdem ist die Auswertung von Methodenaufrufen, Statements und Expressions möglich.

## Integration-Tests

In den Integration-Tests werden der Parser, Type-Checker und ByteCode-Generator gemeinsam getestet. Die Eingabe ist somit ein String, der Java-Quellcode enthält und die Ausgabe ist Java-Bytecode. Über Reflection können dann Methoden im generierten Bytecode aufgerufen werden. Anschließend wird das Ergebnis validiert.

## Functional-Tests

In einem Functional-Test wird der gesamte Compiler als Java Anwendung überprüft. Hierzu wird die Jar-Datei mit einem Kommandozeilenargument (Pfad zu einer Java-Datei, die kompiliert werden soll) aufgerufen. Die Anwendung kompiliert anschließend ein .class-File aus dem Quellcode. Da von dem entwickelten Compiler keine statischen Methoden unterstützt werden (somit auch kein public static void main(String args[])), müssen die generierten Klassen von einer weiteren Java-Datei, die über JavaC kompiliert wird, eingebunden werden. Diese Hilfsdatei enthält den Einstiegspunkt und testet die kompilierten Klassen auf ihre Funktionalität.
