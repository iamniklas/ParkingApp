Feature: Parkplatz finden

Scenario: Den nächsten freien Parkplatz finden
	Given Parkplatz 5 in Datenbank
	When Parkplatz 5 ist parkbar
	Then Parkplatzinformationen von Parkplatz 5 an Navigationssystem übergeben	