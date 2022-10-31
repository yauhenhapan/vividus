Scenario: Start the application
Given I start mobile application

Scenario: Decline pop-up
Meta:
    @targetPlatform android
When I save number of elements located `<buttonLocator>` to scenario variable `button`
When I execute steps at most 5 times while variable `button` is = `1`:
|step                                              |
|When I tap on element located by `<buttonLocator>`|
|When I save number of elements located `<buttonLocator>` to scenario variable `button`|

Examples:
|buttonLocator                                                                         |
|xpath(.//*[@text = 'CANCEL' or @resource-id='android:id/button2' or @content-desc='Close tips'])|


Scenario: Validate application start
When I wait until element located `accessibilityId(test-Username)` appears
When I take screenshot