package practice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.nio.charset.Charset;

	import java.io.*; 
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
	// Java program to print largest contiguous array sum 
import java.util.*; 
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

//import jxl.Cell;
//import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;







import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethodBase;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.params.HttpClientParams;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;



import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.util.ArrayUtil;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.tools.ant.types.CommandlineJava.SysProperties;
import org.eclipse.jetty.server.session.HashSessionIdManager;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import com.google.common.primitives.Ints;


/*
	
$ git init
Create a new local repository
$ git status
Lists all the newly created files or modified files to be committed
$ git add
Prepares the files for commit by adding them into the staged area
$ git commit -m "initial code commit to demo git"
Adds the staged files permanently in version history (in local repository)

$ git config --global user.name "Ganesh Bhure"
Defines the name you want to associate with your commit
$ git config --global user.email "ganesh.bhure1@gmail.com"

$ git commit -m "second commit"
$ git log
$ git diff 437d8c9b6919da72804c1b3c51cd14639fd6e164
$ git branch -M main    // M stands for rename
$ git remote add origin https://github.com/gbhure/git-demo-22jun.git
$ git push -u origin main   //up to date
$ git checkout to change the branch 
git clone clone  the remote repository to local
git pull - get latest files from remote repository to update to local repository or branch 
git diff shows difference between 2 commits , branchews, files on working directory or on staged 
git merge "branchname" (branch name of other branch ,combing with current branch)

git rebase 
Git rebase will integrate one branch commits to another branch by this the commit history will be rewritten.
A new commit will be created when you integrate the changes. 

creating new branch and push to main 
git branch vijay1
git checkout vijay1
git pull origin main
git status
 git add 101.txt  // Update existing file or add new files
git status
git commit -m "modified1"
git push 'https://github.com/gvijaysankar/test3'  
check branch is available in git remote repository or commits 
then raise a Compare and PR(Pull Request)  
if any conflicts are there , resolve the comflicts

Resove the conflicts 
git pull origin main
git checkout vijay1
git merger main 
git push -u origin vijay1

open the file in notepad, you can see as -
VijaySankartest4444
<<<<<<< HEAD
treshssvijay
=======
treshssvijay1
>>>>>>> ca4082f83a3742ec14fadee47131e67b74a70289

keep the text which you want 
the do following 
git add *
git commit -m "resolved"
git push origin vijay1
then approver can Merge Pull Request after that confirm merge then can delete brancg (Delete Branch)

git fetch --all
git reset --hard origin/master  

git test vijay1
git test vijay2
                                                                          
*/
