Feature: Verify adatin hotel details 

Scenario Outline: Verifying adatin hotel Login Page 
	Given User is on the adatin hotel page 
	When User should enter "<user>" and "<pass>" 
	And User should select "<location>", "<hotel>", "<roomType>", "<rooms>", "<inDate>", "<outDate>", "<adultsNos>", "<childrenNos>"  and click search. 
	Then User should select the required hotel and click continue button. 
	And User should enter "<firstName>", "<lastName>", "<address>", "<ccNo>", "<ccType>", "<expMon>", "<expYr>", "<cvv>" and click Book now button. 
	Then User should check the booking id. 
	
	Examples: 
		| user     | pass   | location  | hotel          | roomType     | rooms     | inDate     | outDate    | adultsNos | childrenNos | firstName | lastName | address          | ccNo             | ccType           | expMon | expYr | cvv |
		| Viki5497 | 3RPLV4 | Sydney    | Hotel Creek    | Standard     | 2 - Two   | 20/10/2020 | 27/10/2020 | 1 - One   | 0 - None    | Viki      | R        | 72 xxx, yyy, zzz | 9876543210654321 | VISA             | July   |  2021 | 007 |
		