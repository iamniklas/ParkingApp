Feature: Parkplatz finden

Scenario: Den nächsten freien Parkplatz finden
	Given Parkplatz 5 in Datenbank
	When Parkplatz 5 ist parkbar
	Then Parkplatzinformationen von Parkplatz 5 an Navigationssystem übergeben
	
Scenario: Parkplatz im nutzerdefinierten Radius finden
	Given Parkplatz im angegebenen Radius sind vorhanden
	When Parkplätze im angegebenen Radius sind nutzbar
	Then Zeige 3 Parkplätze in der GUI an
	
Scenario: Kein Parkplatz gefunden, gratis Autowäsche als Alternativvorschlag
	Given Es gibt einen Parkplatz mit Distanz 10
	And Es gibt einen Parkplatz mit Distanz 5
	When Benutzer möchte mit Distanz 2 parken
	Then Nutzer bekommt Fehlerbenachrichtigung