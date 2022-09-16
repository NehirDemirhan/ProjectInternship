Feature: Locations Functionality

  Background:
    Given Navigate to Campus
    When  Enter username and password and click login button
    Then  User should login successfully

  @GIP4-7
  Scenario: Create Locations
    And Click on the element in the left Nav
      | setupOne    |
      | schoolSetup |
      | locations   |


    And Click on the element in the Dialog content
      | school    |
      | schoolNew |
      | addButton |

    And User sending the keys in Dialog content
      | nameInput      | Deneme |
      | shortNameInput | Dnm    |
      | capacity       | 5      |

    And Click on the element in the Dialog content
      | saveButton |

    And Success message should be displayed

  @GIP4-7
  Scenario: Edit Locations
    And Click on the element in the left Nav
      | setupOne    |
      | schoolSetup |
      | locations   |


    And Click on the element in the Dialog content
      | school     |
      | schoolNew  |
      | editButton |

    And User sending the keys in Dialog content
      | nameInput      | Deneme123 |
      | shortNameInput | Dnm123    |
      | capacity       | 7         |

    And Click on the element in the Dialog content
      | locationType      |
      | locationTypeOther |

    And Click on the element in the Dialog content
      | saveButton |


    And Success message should be displayed


  @GIP4-7
  Scenario: Delete locations
    And Click on the element in the left Nav
      | setupOne    |
      | schoolSetup |
      | locations   |


    And Click on the element in the Dialog content
      | school          |
      | schoolNew       |
      | deleteButton    |
      | deleteDialogBtn |

    And Success message should be displayed




