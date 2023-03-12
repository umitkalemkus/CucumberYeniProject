Feature: Parametreli step kullanimi


  Scenario: Cucumber step definition(Cucumber Edition)
    Given Ilk sayi 5
    And Ikinci sayi 3
    When Bu sayilari + operatorune sokarsam
    Then sonuc 8 olmalidir


  Scenario Outline: : Cucumber step definition(Cucumber Edition) outline
    Given Ilk sayi <sayi1>
    And Ikinci sayi <sayi2>
    When Bu sayilari <operator> operatorune sokarsam
    Then sonuc <sonuc> olmalidir
    Examples:
      |sayi1|sayi2|operator|sonuc|
      |10   |15   |    +   |  25 |
      |11   |9    |    -   |  2  |
      |15   |3    |    *   |  45 |
      |15   |3    |    /   |  5  |



  Scenario: Cucumber step definition (RegEx Edition)
    Given Ismim "Karl"
    And Soyismim "Ortis"
    When Ehliyet Aldigimda
    Then Ehliyet Aldigimda "Karl Ortis" yazmalidir