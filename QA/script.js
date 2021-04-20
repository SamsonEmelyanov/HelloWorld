const webDriver=require('selenium-webdriver');
const driver=new webDriver.Builder().forBrowser('firefox').build();
const By=webDriver.By;

(async function testRun(){
await driver.get('https://www.google.ru/');
console.log("Браузер взлетел! Поиск по ключевому слову PIERRE WOODMAN");
const searchField=await driver.findElement(By.xpath('//input[@title="Поиск"]'));
searchField.sendKeys('PIERRE WOODMAN');
await driver.sleep(1000);
searchField.sendKeys(webDriver.Key.ENTER);
    await driver.sleep(3000);
const results=await driver.findElements(By.xpath('//div[@class="g"]'));
console.log("Количество результатов поиска = " + results.length);

for (let element of results){
    let text =await element.getText();
    console.log('------------------------');
    console.log(text);
    console.log('------------------------');
}
driver.close();
})()



