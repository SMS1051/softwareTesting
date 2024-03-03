package org.stepDefinition;

import java.util.List;
import java.util.Map;

import org.bas.BASIC;
import org.bas.Saifullah;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class testPre extends BASIC  {
	
Saifullah  k ;

	@Given("To launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {
				lanchBrowser();
				WindowMaximize();
	}

	@When("To launch url in facebook application")
	public void to_launch_url_in_facebook_application() {
			launchURL("https://www.facebook.com/");
	}

	@When("To click the creat new account button")
	public void to_click_the_creat_new_account_button() {
	    k = new Saifullah();
	    CllickButton(k.getAcbtn());
	}

	@When("To pass the firstname in the firstname text box")
	public void to_pass_the_firstname_in_the_firstname_text_box(DataTable m) {
	  List<String> list = m.asList();
		k = new Saifullah();
		passText(list.get(2), k.getFirstname());
	}

	@When("To pass the secondname in secondname text box")
	public void to_pass_the_secondname_in_secondname_text_box(DataTable h) {
	   List<List<String>> o = h.asLists();
		k = new Saifullah();
		passText(o.get(1).get(2), k.getSecondname());
	}

	@When("To pass the email or mobileno in emil text box")
	public void to_pass_the_email_or_mobileno_in_emil_text_box(DataTable u) {
		Map<String, String> map = u.asMap(String.class, String.class);
		k = new Saifullah();
		passText(map.get("Email 2"),k.getEmail());
	}

	@When("To pass the password in new password text box")
	public void to_pass_the_password_in_new_password_text_box(DataTable n) {
	   List<Map<String, String>> d = n.asMaps();
		k = new Saifullah();
		passText(d.get(0).get("password 2"), k.getPassword());
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	   
		closeEntireBrowser();
	}
	 
}
