Feature:Human Resources

  Background:
    Given Navigate to Campus
    When  Enter username and password and click login button
    Then  User should login successfully


  Scenario:  Add Attestations
    And We click on the element in the left Nav
      | humanResources |
      | setupThree     |
      | attestations   |

    And We click on the element in the left Nav
      |  addButtonn    |

    And The user sending the keys in Dialog content
      | nameInput     | steven |

    And We click on the element in the Dialog content
      | saveButton |

    Then Success message should be displayed to user

  Scenario: Edit attestations
    And We click on the element in the left Nav
      | humanResources |
      | setupThree       |
      | attestations    |

    And The user sending the keys in Dialog content
      | searchInputt | steven |

    And We click on the element in the Dialog content
      | searchButton |
      | EditButtonn  |

    And The user sending the keys in Dialog content
      | nameInput | steven4 |

    And We click on the element in the Dialog content
      | saveButton |

    Then Success message should be displayed to user

  Scenario: Delete attestations
    And We click on the element in the left Nav
      | humanResources |
      | setup          |
      | attestations   |

    And The user delete item from Dialog
    | steven4 |

    Then Success message should be displayed to user


