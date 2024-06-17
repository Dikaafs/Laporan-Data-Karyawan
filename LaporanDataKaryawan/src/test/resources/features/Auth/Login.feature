Feature: login
  sebagai user saya ingin melakukan login
  sehingga saya dapat mengakses diarium

  @Login
  Scenario: sebagai user saya bisa melakukan login dengan valid input
    Given user berada di halaman login
    When user memasukan NIK
    And user memasukan password
    And user click sign button
    Then user diarahkan ke dashboard page