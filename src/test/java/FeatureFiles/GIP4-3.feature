Feature: Document Types under Parameters Setup Functionality

  Background:
    Given Navigate to Campus
    When  Enter username and password and click login button
    Then  User should login successfully

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