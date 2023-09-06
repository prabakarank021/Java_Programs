package c1_xpathAndCss;

public class L7_CSS {

	//Mostly we use xpath, but we can face any browser compatibility error we can go with CSS selector but 90% we use xpath only
	//Disadvantages of CSS Selector 
	//No text find element
	//no preceding concept
	
	//Advantages of CSS Selector
	// CSS faster than xpath 
	//CSS don't have text finding, following, preceding - It has only forward direction searching like as following - It won't allow reverse direction searching - But many company prefer CSS only
	// .// - >
	// and - [][]
	// or - [],[]
	// contains - *
	// starts-with - ^
	// ends-with - $
	// id - #
	// class - .
	// :: - :

	// CSS default deep link
	
	// xpath - tagname[@attribute='value']
	// css - tagname[attribute='value']

	// ----------------------------------------------------------------------

	// css syntax
	// tagname[attribute='value']
	// textarea[id='sb_form_q']

	// contains syntax
	// tagname[attribute*='value']
	// textarea[id*='sb_form_q'] - true
	// textarea[id*='b_form_q'] - true
	// textarea[id*='sb_form_'] - false
	// textarea[id*='sb_form_q'] - False - Because middle content is missing

	// -----------------------------------------------------------------------

	// starts-with syntax
	// tagname[attribute^='value']
	// textarea[id^='sb_form_q'] - true
	// textarea[id^='sb_form_'] - True
	// textarea[id^='b_form_q'] - False
	// textarea[id^='sb_fm_q'] - False - Because middle content is missing

	// -----------------------------------------------------------------------

	// ends-with syntax
	// tagname[attribute$='value']
	// textarea[id$='sb_form_q'] - True
	// textarea[id$='b_form_q'] - True
	// textarea[id$='sb_form_'] - False
	// textarea[id$='sb_fm_q'] - False - Because middle content is missing

	// -----------------------------------------------------------------------

	// AND Operator

	// syntax - tagname[attribute$='value'][attribute$='value']
	// Example - textarea[id='sb_form_q'][name='q'] -true
	// Example - textarea[id='sb_form_q'][name=''] -false
	// Example - textarea[id='sb_form_'][name='q'] -false
	// Example - textarea[id='sb_form_'][name=''] -false

	// -----------------------------------------------------------------------
	// OR Operator
	// syntax - tagname[attribute$='value'],[attribute$='value']
	// Example - textarea[id='sb_form_q'],[name='q'] -true
	// Example - textarea[id='sb_form_q'],[name=''] -true
	// Example - textarea[id='sb_form_'],[name='q'] -true
	// Example - textarea[id='sb_form_'],[name=''] -false

	// ---------------------------------------------------------------------------

	// id - #
	// class - .    //Class general usage - To locate group of elements
	//findelement(By.className) - We shouldn't use this function if class name is double reference (sb_form_q sb_form_ta)
	//sb_form_q sb_form_ta --- .sb_form_q sb_form_ta - general className function will not consider as space between the className. We need to replace from space to dot - .sb_form_q.sb_form_ta 

	// syntax - #idName
	// Example - #sb_form_q
 
	// syntax - .className
	// Example - .sb_form_q.sb_form_ta - True
	// Example - .sb_form_q sb_form_ta - False

	// ---------------------------------------------------------------------------

	// first-of-type - First child 
	// last-of-type - Last child 
	// nth-of-type - Middle child - we can locate by using index
	// nth-child - Combined of above three - we can locate by using index

	// syntax - tagname[attribute$='value']>tagname:first-of-type
	// Example - ul[class="scopes "]>li:first-of-type

	// syntax - tagname[attribute$='value']>tagname:last-of-type
	// Example - ul[class="scopes "]>li:last-of-type

	// syntax - tagname[attribute$='value']>tagname:nth-of-type(Index)
	// Example - ul[class="scopes "]>li:nth-of-type(2)
	
	// syntax - tagname[attribute$='value']>tagname:nth-child(Index)
	// Example - ul[class="scopes "]>li:nth:chil(2)
	
	//----------------------------------------------------------------------------
	
//	chained locator
	
//	syntax  - tagname[attribute$='value']>tagname[attribute$='value']>tagname[attribute$='value']> .....
//	Example - div[class='overflow_container']>div[class='submenu']>ul[class='overflow_menu']
	
	
}
