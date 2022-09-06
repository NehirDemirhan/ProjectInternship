Feature: School Locations Functionality

  Background:
    Given Navigate to Campus
    When  Enter username and password and click login button
    Then  User should login successfully

  Scenario:  Add a Locations
    And Click on the element in the left Nav
      | setupOne    |
      | schoolSetup |
      | locations   |

    And Click on the element in the Dialog content
      | addButton |

    And User sending the keys in Dialog content
      | nameInput      | Samet |
      | shortNameInput | Smt   |
      | capacity       | 17    |

    And Click on the element in the Dialog content
      | locations     |
      | locationsType |

    And Click on the element in the Dialog content
      | saveButton |

    Then Success message should be displayed


  Scenario:  Edit a Locations
    And Click on the element in the left Nav
      | setupOne    |
      | schoolSetup |
      | locations   |

    And Click on the element in the Dialog content
      | editButton |

    And User sending the keys in Dialog content
      | nameInput      | Samet123 |
      | shortNameInput | Smt1234  |

    And Click on the element in the Dialog content
      | saveButton |

    Then Success message should be displayed


  Scenario:  Delete a Locations
    And Click on the element in the left Nav
      | setupOne    |
      | schoolSetup |
      | locations   |

    And Click on the element in the Dialog content
      | deleteButton    |
      | deleteDialogBtn |
      | deleteButton    |
      | deleteDialogBtn |
      | deleteButton    |
      | deleteDialogBtn |

    Then Success message should be displayed