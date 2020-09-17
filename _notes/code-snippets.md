## Selenium API
### Set the location of chrome driver
System.setProperty("webdriver.chrome.driver", "path of chromedriver");


## Browser
```
  driver = new ChromeDriver();
  driver.get("https://the-internet.herokuapp.com/");

  System.out.println((driver.getTitle()));

  driver.manage().window().maximinze();
  // test mobile device
  driver.manage().window().setSize(new Dimension(375, 812));


  driver.quit();
  driver.close();   // close window not the session
```
### driver.findElement
- By.Name
- By.ClassName
- By.Id
- By.XPath
- Link text
- Tag Name


```
  WebElement inputLink = driver.findElement(By.linkText("Inputs"));
  inputLink.click();

  List<WebElement> links = driver.findElement(By.tagName("a"));
```


### Perform actions


- element.sendKeys();
- element.submit();
- Click
- dragAndDrop
- KeyDown
- MoveToElement();
