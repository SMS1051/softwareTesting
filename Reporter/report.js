$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/rock.feature");
formatter.feature({
  "name": "To validate the creat account in facebook application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To creat new account in fb application",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "testPro.to_launch_the_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch url in facebook application",
  "keyword": "When "
});
formatter.match({
  "location": "testPro.to_launch_url_in_facebook_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the creat new account button",
  "keyword": "And "
});
formatter.match({
  "location": "testPro.to_click_the_creat_new_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the firstname in the firstname text box",
  "rows": [
    {
      "cells": [
        "shameem",
        "Prasath",
        "mathi",
        "RK Bulders Rakkamma",
        "Riyas sir"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "testPro.to_pass_the_firstname_in_the_firstname_text_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the secondname in secondname text box",
  "rows": [
    {
      "cells": [
        "Salahudeen",
        "7845596373",
        "Ring"
      ]
    },
    {
      "cells": [
        "Selenium",
        "Inmakes",
        "Makes"
      ]
    },
    {
      "cells": [
        "Cucumber",
        "Snake sneha",
        "Free"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "testPro.to_pass_the_secondname_in_secondname_text_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the email or mobileno in emil text box",
  "rows": [
    {
      "cells": [
        "mail1",
        "Nisandhini@gmail.com"
      ]
    },
    {
      "cells": [
        "mail2",
        "Muslimgirl1345@gmail.com"
      ]
    },
    {
      "cells": [
        "mail3",
        "Prasath1345@gmail.com"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "testPro.to_pass_the_email_or_mobileno_in_emil_text_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the password in new password text box",
  "rows": [
    {
      "cells": [
        "Password1",
        "Password2",
        "Password3"
      ]
    },
    {
      "cells": [
        "Rakesh111",
        "Mathi666",
        "007999"
      ]
    },
    {
      "cells": [
        "sala9080",
        "Rakesh111",
        "Rake999"
      ]
    },
    {
      "cells": [
        "kattakunju",
        "Itemrakesh",
        "Kenapundaprasanth"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "testPro.to_pass_the_password_in_new_password_text_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "testPro.to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});