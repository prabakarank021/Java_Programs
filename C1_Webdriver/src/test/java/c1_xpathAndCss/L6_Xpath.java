package c1_xpathAndCss;

public class L6_Xpath {

    //If we try to click the invisible element we get an ElementNotIntractable exception
	//If we can't identify the exact tag name so we can give * instead of tagName
	
	//   .// - Meaning, Deep linking
	
	// xpath types
	// Absoulte -/html/body/.....
	// Relative -.//tagname[@attribute='value']

	// Syntax - .//tagname[@attribute='value']

	// Example - .//textarea[@id='sb_form_q']
	// Example - .//textarea[@placeholder='Ask me anything...']

	// Example Elelemnt- (.//textarea[@id='sb_form_q'])
	// wd.findElement(by.xpath("(.//textarea[@id='sb_form_q'])"))    //We should use compulsory () in findElement 

	// ------------------------------------------------------------------------------

	// Text format - We need to give the full text
	// syntax - .//tagname[text()='value']
	// Example - .//span[text()='Languages:']
	// Example - .//a[text()='Maps']
	
	// -----------------------------------------------------------------------------

	// contains
	// syntax - .//tagname[contains(text(),value)]
	// syntax - .//tagname[contains(text()=value)] //Its wrong - we shouldn't give (equal to) inside the function (Contains is a function)
	
	// Example - .//span[contains(text(), 'Languages:')] - True
	// Example - .//span[contains(text(), 'Languag')]    - True
	// Example - .//span[contains(text(), 'guages:')]    - True
	// Example - .//span[contains(text(), 'Langes:')]    - False - Because missed the middle content

	// Syntax - .//tagname[contains(@attribute,value)]
	
	// Example - .//textarea[contains(@id,'sb_form_q')] - True
	// Example - .//textarea[contains(@id, 'sb_form_')] - True
	// Example - .//textarea[contains(@id,'b_form_q')]  - True
	// Example - .//textarea[contains(@id,'sb_fom_q')]  - False - Because missed the middle content

	// ------------------------------------------------------------------------------

	// starts-with
	// syntax - .//tagname[starts-with(text(),value)]
	
	// Example - .//span[starts-with(text(), 'Languages:')] - True
	// Example - .//span[starts-with(text(), 'Lan')]        - True
	// Example - .//span[starts-with(text(), 'guages:')]    - False
	// Example - .//span[starts-with(text(), 'Langes:')]    - False - Because missed the middle content

	// Syntax - .//tagname[starts-with(@attribute,value)]
	
	// Example - .//textarea[starts-with(@id,'sb_form_q')] - True
	// Example - .//textarea[starts-with(@id,'sb_fo')]     - True
	// Example - .//textarea[starts-with(@id,'b_form_q')]  - False
	// Example - .//textarea[starts-with(@id,'sb_fom_q')]  - False - Because missed the middle content

	// -------------------------------------------------------------------------------

	// ends-with // It won't work in the chrome browser inspect and find
	// syntax - .//tagname[ends-with(text(),value)]
	
	// Example - .//span[ends-with(text(), 'Languages:')] - True
	// Example - .//span[ends-with(text(), 'Lan')]        - False
	// Example - .//span[ends-with(text(), 'ges:')]       - True
	// Example - .//span[ends-with(text(), 'Langes:')]    - False - Because missed the middle content

	// Syntax - .//tagname[ends-with(@attribute,value)]
	
	// Example - .//textarea[ends-with(@id,'sb_form_q')] - True
	// Example - .//textarea[ends-with(@id,'sb_fo')]     - False
	// Example - .//textarea[ends-with(@id,'rm_q')]      - True
	// Example - .//textarea[ends-with(@id,'sb_fom_q')]  - False - Because missed the middle content

	// -------------------------------------------------------------------------------
	
	//AND or OR
	//syntax - .//tagname[@attribute='value' and @attribute='value'] - true
	//Example - .//textarea[@id='sb_form_q' and @name='q'] -true
	//Example - .//textarea[@id='sb_form_' and @name='q'] -false
	//Example - .//textarea[@id='sb_form_q' and @name=''] -false
	
	//syntax - .//tagname[@attribute='value' or @attribute='value'] - true
	//Example - .//textarea[@id='sb_form_q' or @name='q']           - true
	//Example - .//textarea[@id='sb_form_' or @name='q']            - true
	//Example - .//textarea[@id='sb_form_q' or @name='']            - true
	//Example - .//textarea[@id='sb_form_' or @name='']             - false
	
	// -------------------------------------------------------------------------------
    
	//Following - It takes immediate following all the element
	
	//syntax - .//tagname[text()='value']/following::tagname
	//syntax - .//tagname[@attribute='value']/following::tagname
	//syntax - .//tagname[@attribute='value']/following::tagname[index]
	//syntax - (.//tagname[@attribute='value']/following::tagname)[index]
	
	//Example - .//span[text()='Languages:']/following::a
	//Example - .//span[text()='Languages:']/following::a[1]
	//Example - (.//span[text()='Languages:']/following::a)[1]
	
	// ------------------------------------------------------------------------------
	
    //Preceding - It takes top most preceding element and ends with we mentioned element
	
	//syntax - .//tagname[text()='value']/preceding::tagname
    //syntax - .//tagname[@attribute='value']/preceding::tagname
	//syntax - .//tagname[@attribute='value']/preceding::tagname[index]
	//syntax - (.//tagname[@attribute='value']/preceding::tagname)[index] 
		
	//Example - .//span[text()='Languages:']/preceding::a
	//Example - .//span[text()='Languages:']/preceding::a[1]
	//Example - (.//span[text()='Languages:']/preceding::a)[1]
	
	// -------------------------------------------------------------------------------

	//Ancestor -Top most element
	
	//syntax - .//tagname[text()='value']/ancestor::tagname
    //syntax - .//tagname[@attribute='value']/ancestor::tagname
	//syntax - .//tagname[@attribute='value']/ancestor::tagname[index]
	//syntax - (.//tagname[@attribute='value']/ancestor::tagname)[index]
	
	//Example - .//textarea[@id='sb_form_q']/ancestor::a
	//Example - .//textarea[@id='sb_form_q']/ancestor::a[1]
	//Example - (.//textarea[@id='sb_form_q']/ancestor::a)[1]
	
	//--------------------------------------------------------------------------------
	
	//Chained locator
	//Syntax - .//tagname[@attribute='value']/tagname[@attribute='value']/tagname[@attribute='value']/.......
	//Example - .//div[@class='submenu']/ul[@class='overflow_menu']
	//Example - .//div[@class='overflow_container']/div[@class='submenu']/ul[@class='overflow_menu']
	
	//--------------------------------------------------------------------------------
	 
    //descendant -  all the low-level elements - immediate low element to last low element - Always use () 
	
	//syntax - .//tagname[text()='value']/descendant::tagname
    //syntax - .//tagname[@attribute='value']/descendant::tagname
	//syntax - .//tagname[@attribute='value']/descendant::tagname[index]
	//syntax - (.//tagname[@attribute='value']/descendant::tagname)[index] 
	
	//Example - (.//div[@class='hpapp']/descendant::li)[1]
	//Example - (.//div[@class='hpapp']/descendant::a)[1]
	//Example - .//div[@class='hpapp']/descendant::li[1] - Not recommend
	
	//----------------------------------------------------------------------------------
	
	//Child - Low level - Only child can be usable
	
    //syntax - .//tagname[@attribute='value']/child::tagname
	//Example - .//div[@class='submenu']/ul[@class='overflow_menu']/child::li
	//Example - .//div[@class='submenu']/ul[@class='overflow_menu']/child::li
	//Example - .//div[@class='submenu']/ul[@class='overflow_menu']/child::a - not found because it is grandson
	
	//---------------------------------------------------------------------------------
	
	//Following-sibling - Younger brothers 
	
	//syntax - .//tagname[@attribute='value']/following-sibling::tagname
	//Example  - .//li[@id='excel']/following-sibling::li
	
	//---------------------------------------------------------------------------------
	
	//Preceding-sibling - Elder brothers  
	
	//syntax - .//tagname[@attribute='value']/preceding-sibling::tagname
	//Example  - .//li[@id='excel']/preceding-sibling::li
    
	//---------------------------------------------------------------------------------

	//   / - Route element
	//  :: - Conditional 
	
	
//	(.//div[@class='zg-grid-general-faceout']/div[@class='p13n-sc-uncoverable-faceout']/child::div[3]/span[contains(text(),'Paperback')])
//  .//div[@class='zg-grid-general-faceout']/div[@class="p13n-sc-uncoverable-faceout"]/div[@class="a-row a-size-small"]/a[@class="a-size-small a-link-child"]/div[text()='Maple Press'] 
		
}
