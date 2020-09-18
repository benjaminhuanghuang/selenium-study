## Install ChromeDriver
Download ChromeDirver from (https://chromedriver.chromium.org/)

Put the ChromeDirver into the project folder
```
/resources
```
In source code add 
```
 System.setProperty("webdriver.chrome.driver","resources/chromedriver");
```
## Dependency
```
 <dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-chrome-driver</artifactId>
    <version>${selenium.version}</version>
  </dependency>
  <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-support</artifactId>
      <version>${selenium.version}</version>
  </dependency>
```