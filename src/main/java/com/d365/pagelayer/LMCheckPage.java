package com.d365.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class LMCheckPage extends MasterClass
{
   public LMCheckPage()
   {
	   PageFactory.initElements(driver, this);
   }
   
 //---LmCheck
   @FindBy(xpath="//a[text()=\"LM Check\"]")
   private WebElement btnlinkLmCheck;    
   public WebElement btnlinkLmCheck() {
       return btnlinkLmCheck;
   }

   //---LmRejection
   @FindBy(xpath="//span[text()=\"LM  Rejection\"]")
   private WebElement btnLmRejection;    
   public WebElement btnLmRejection() {
       return btnLmRejection;
   }

   //---LmRejectionNewBtn
   @FindBy(xpath="//span[contains(text(),\"New\")]")
   private WebElement btnLmRejectionNew;    
   public WebElement btnLmRejectionNew() {
       return btnLmRejectionNew;
   }

   //---IssuebtnofLMcheck
   @FindBy(xpath="//span[text()=\"Issue\"]")
   private WebElement btnIssueLmCheck;    
   public WebElement btnIssueLmCheck() {
       return btnIssueLmCheck;
   }

   //---issuetoPOfromLM
   @FindBy(xpath="//span[text()=\"Issue To PO\"]")
   private WebElement btnIssueToPOfromLM;    
   public WebElement btnIssueToPOfromLM() {
       return btnIssueToPOfromLM;
   }

   //---lmuser
   @FindBy(xpath="//input[@name=\"Fld1_1\"]")
   private WebElement txtLmUser;    
   public WebElement txtLmUser() {
       return txtLmUser;
   }

}
