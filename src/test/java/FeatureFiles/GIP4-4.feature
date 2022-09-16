Feature: Fields Functionality

  Background:
    Given Navigate to Campus
    When  Enter username and password and click login button
    Then  User should login successfully

  @GIP4-4
  Scenario: Create New Fields

    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | fields     |

    And Click on the element in the Dialog content
      | addFields |

    And User sending the keys in Dialog content
      | nameInput  | x4353x |
      | codeInputb | x43x   |

    And Click on the element in the Dialog content
      | saveButton |

    Then Success message should be displayed

  @GIP4-4
  Scenario: Edit Fields

    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | fields     |

    And User sending the keys in Dialog content
      | searchInputb | x4353x |


    And Click on the element in the Dialog content
      | searchButtonb |
      | editButton    |

    And User sending the keys in Dialog content
      | nameInput  | z4350z |
      | codeInputb | z40z   |

    And  Click on the element in the Dialog content
      | saveButton |

    And Success message should be displayed

  @GIP4-4
  Scenario: Delete Fields
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | fields     |

    And User sending the keys in Dialog content
      | searchInputb | z4350z |

    And  Click on the element in the Dialog content
      | searchButtonb |

    And  Click on the element in the Dialog content
      | deleteButton    |
      | deleteDialogBtn |

    And Success message should be displayed

