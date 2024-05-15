# anwenundungssysteme_ha_1
Programmiere ein Lagerverwaltungssystem, mit dem der User über das Terminal interagieren kann.

- 1 -
Anwendungssysteme (SoSe 2024)
Prof. Dr.-Ing. D. Bermbach, T. Schirmer
Übungsaufgabe 1: Enterprise Programming
Hinweise
- Die Abgabe dieser Übungsaufgabe muss bis spätestens am Freitag, 24.5.2024 um
18:00h im ISIS-Kurs erfolgen.
- Bitte beachten Sie, dass Abgaben im Rahmen des Übungsbetriebs für die Zulassung
zur Klausur relevant sind. Eingereichte Plagiate, Gruppenarbeit o. ä. werten wir als
Täuschungsversuch.
- Als Lösung zu diesem Übungsblatt geben Sie zwei Dateien ab: ein PDF, und den
Source-Code Ihres Projektes als gezippten Projektordner.
Aufgabe (14 Punkte)
Entwickeln Sie ein konsolenbasiertes Lagerverwaltungssystem. In diesem System soll es
möglich sein:
- Sich alle gelagerten Produkte anzeigen zu lassen.
- Nach Produkten und Produktkategorien zu suchen.
o Mindestanforderung: Als Suchparameter wird ein String abgefragt. Es werden
dann Produkte zurückgegeben, bei denen dieser String in mindestens einem
Attribut des Produktes (z. B. Name, Kategorien, …) vorkommt.
- Produkte im System anzulegen und die gelagerte Menge zu ändern.
o Mindestanforderung: Man kann interaktiv ein Produkt und die Menge
angeben, die hinzugefügt/entnommen wird. Die neue Lagermenge wird
automatisch berechnet.
- Die monatlichen Kosten für die Lagerung aller Produkte ausgeben.
o Mindestanforderung: Es gibt einen Lagerkostenwert pro Produkt (z. B.
abhängig von Gewicht oder benötigter Lagerfläche des jeweiligen Produkts)
pro Zeiteinheit.
o Mindestanforderung: Einige Produkte müssen gesondert gelagert werden (z.B.
Kühlung oder besonders sichere Lagerung). Die Lagerung für diese Produkte
ist teurer.
- Im Lagersystem sollen sowohl Produkte die nach Gewicht verkauft werden (Schüttgut
wie z. B. Erde, Beton) als auch einzeln verkaufte Produkte (Stückgut) gelagert werden.
- 2
-
Stellen Sie sicher, dass alle relevanten Teile Ihres Codes mit Unit-Tests getestet sind, und
geben Sie die Testabdeckung in Prozent in Ihrer PDF-Abgabe an (es gibt keine
Mindestabdeckung, die Sie erreichen müssen). Für mindestens eine Methode sollten dabei
über Unittests Standard- und Grenzfälle (=average case + corner cases) abgedeckt sein.
Nutzen Sie zur Entwicklung des Systems die Programmierspreche Java mit folgenden
Technologien:
- Gradle oder Maven als Buildtool
- JUnit für die Unit-Tests
- Lombok zum automatisierten Generieren von repetitivem Code
- Benutzen Sie nur das von Lombok mitgelieferte Logging und kein
System.out.println(), um etwas auf der Konsole auszugeben. Benutzen Sie
für interaktiven Input von Usern das Log-Level WARNING.
Benutzen Sie als Ausgangspunkt eine der Vorlagen. In der Vorlage befindet sich auch eine
Beispielausgabe eines Programmes, an die Sie sich aber nicht halten müssen.
Abgabe
Dokumentieren Sie sämtliche bewertungsrelevante Teile Ihrer Abgabe in einer PDF-Datei.
Diese Datei darf nicht mehr als 10 Seiten erhalten, davon maximal eine Seite Fließtext. Der
Rest der Datei darf nur aus Grafiken und relevanten Source-Code-Ausschnitten Ihres Codes
bestehen. In dieser Datei müssen alle für Ihre Lösung und die Bewertung relevanten Inhalte
enthalten sein.
Geben Sie im ISIS-Kurs zwei Dateien ab: die PDF-Datei und den Source-Code Ihres Projektes
als gezippten Projektordner.
Hinweise
- Stellen Sie sicher, dass Sie alle genannten Anforderungen erfüllen und
dokumentieren. Wenn eine Anforderung nicht ganz eindeutig ist (z. B. Berechnung
der Lagerkosten), ist es Ihre Aufgabe, eine möglichst logische Implementierung
auszuwählen.
- Sie brauchen keine persistente Datenhaltung zu implementieren. Wenn das
Programm neu gestartet wird, können also alle Daten verloren sein. Auch müssen Sie
weder Nebenläufigkeit, entfernen Zugriff oder irgendeine Form graphischer
Oberflächen implementieren: Es reicht, wenn ein einzelner User über die Konsole mit
Ihrem Programm interagieren kann.
- Sie dürfen einzelne Codezeilen mit entsprechender Quellenangabe aus Büchern oder
zitierbaren Internetquellen übernehmen, bewertet wird jedoch nur der
selbstgeschriebene Anteil. Generative KI (z.B. ChatGPT) ist nicht zitierbar.
- 3
-
- Um Ihnen eine bessere Vorstellung über den erwarteten Umfang der Abgabe zu
geben, haben wir Beispiellösungen der Abgaben im letzten Jahr hochgeladen. Bitte
beachten Sie, dass die Lösungen für eine andere Aufgabenstellung sind. Der
erwartete Umfang ist jedoch vergleichbar.
