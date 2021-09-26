
<h1>BANKING APPLICATION</h1>
<h3>Project Description</h3>
<hr>
<p>This banking application is a web-based application that simulates banking operations.</p>
<p>A customer can apply for an account, view their balance, and make withdrawals and deposits.</p> 
<p>An employee can aprove or deny accounts and view account balances for their customers.</p>

<h3>Technologies Used</h3>
<hr>
<ul>
<li>JAVA - version 8</li>
<li>PostgreSQL - version 13</li>
<li>Hibernate - version 3.5</li>
<li>Servlet - Apache Tomcat v9</li>
<li>HTML5 and CSS3</li>
<li>JavaScript</li>
</ul>

<h3>Features</h3>
<hr>
<h4>List of features ready and TODOs for future development</h4>

<ul>
  <li>As a user, I can login.</li>
<li>As a customer, I can apply for a new bank account with a starting balance.</li>
<li>As a customer, I can view the balance of a specific account.</li>
<li>As a customer, I can make a withdrawal or deposit to a specific account.</li>
<li>As the system, I reject invalid transactions. Ex: A withdrawal that would result in a negative balance. A deposit or withdrawal of negative money.</li>
<li>As an employee, I can approve or reject an account.</li>
<li>As an employee, I can view a customer's bank accounts.</li>
<li>As a user, I can register for a customer account.</li>
<li>As a customer, I can post a money transfer to another account.</li>
<li>As a customer, I can accept a money transfer from another account.</li>
<li>As an employee, I can view a log of all transactions.</li>
</ul>
<h3>Getting Started</h3>
<hr>

<p>Clone this Repository - https://github.com/Na-veed/Banking-Application.git clone  Required Environments - Eclipse, PostgreSQL, Java 8, Servlet - Apache Tomcat v9 configured</p>

<p>Make changes to username and password in hibernate.cfg.xml file located in src/main/java to match it with your postgreSQL credentials.</p>
<p>Import the project after cloning in Eclipse IDE. Run the project on server or run the file named 'Home.html' located in src/main/webapp.</p>

<h3>Usage</h3>
<hr>
<p>You can now navigate throughout the app according to the menu showing up on the UI. You can't create multiple accounts with same Id. </p>
<p>You can't transfer negative amount. You can't transfer amount greater than your account balance.</p>
