Feature:Human Resources

  Background:
    Given Navigate to Campus
    When  Enter username and password and click login button
    Then  User should login successfully

@Elif
  Scenario:  Add Attestations
    And Click on the element in the left Nav
      | humanResources |
      | setupThree     |
      | attestations   |

    And Click on the element in the left Nav
      |  addButtonn    |

    And User sending the keys in Dialog content
      | nameInput     | steven |

    And Click on the element in the Dialog content
      | saveButton |

    Then Success message should be display

  @Elif
  Scenario: Edit attestations
    And Click on the element in the left Nav
      | humanResources |
      | setupThree       |
      | attestations    |

    And User sending the keys in Dialog
      | searchInputt | steven |

    And Click on the element in the Dialog
      | searchButton |
      | EditButtonn  |

    And User sending the keys in Dialog
      | nameInput | steven4 |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be display

  @Elif
  Scenario: Delete attestations
    And Click on the element in the left Nav
      | humanResources |
      | setupThree     |
      | attestations   |

    And User delete item from Dialog
    | steven4 |

    Then Success message should be display


