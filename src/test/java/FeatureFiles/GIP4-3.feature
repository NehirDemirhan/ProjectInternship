Feature: Document Types under Parameters Setup Functionality

  Background:
    Given Navigate to Campus
    When  Enter username and password and click login button
    Then  User should login successfully

  @MuharremTest
  Scenario: Add Document Types

    And Click on the element in the left Nav
      | setupOne      |
      | parameters    |
      | documentTypes |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput   | MuharremTR2626                  |
      | description | Muharrem Karapazar Eskişehir 26 |

    And Click on the element in the Form Content
      | switchRequired            |
      | stageSelect               |
      | selectStudentRegistration |
      | selectCertificate         |

    And Click the TAB key

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed


  @MuharremTest
  Scenario: Edit Document Types

    And Click on the element in the left Nav
      | setupOne      |
      | parameters    |
      | documentTypes |

    And User sending the keys in Dialog content
      | searchInput | MuharremTR2626 |

    And Click on the element in the Dialog
      | searchButton |
      | editButton   |

    And User sending the keys in Dialog content
      | nameInput   | MuharremTR2626Edit            |
      | description | M.K. Eskisehir 26 Duzenlendi. |

    And Click on the element in the Form Content
      | switchUseCamera  |
      | stageSelect      |
      | selectEmployment |
      | selectContract   |

    And Click the TAB key

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed


  @MuharremTest
  Scenario: Delete Document Types

    And Click on the element in the left Nav
      | setupOne      |
      | parameters    |
      | documentTypes |

    And User sending the keys in Dialog content
      | searchInput | MuharremTR2626 |

    And Click on the element in the Dialog
      | searchButton    |
      | deleteButtonb   |
      | deleteDialogBtn |

    Then Success message should be displayed