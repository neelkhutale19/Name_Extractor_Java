import java.util.*;
//NameExtractor Method
public class Prac {
String fullName;
String title;
String fname;
String mname;
String lanme;
String sfix;
String words[];
int count;
public String getFullName() {
return fullName;
}
public void setFullName(String fullName) {
this.fullName = fullName;
}
public String getTitle() {
return title;
}

// some demo comments
public void setTitle(String title) {
this.title = title;
}
public String getFirstName() {
return fname;
}
public void setFirstName(String firstName) {
this.fname = firstName;
}
public String getMiddleName() {
return mname;
}
public void setMiddleName(String middleName) {
this.mname = middleName;
}
public String getLastName() {
return lanme;
}
public void setLastName(String lastName) {
this.lanme = lastName;
}
public String getSuffix() {
return sfix;
}
public void setSuffix(String suffix) {
this.sfix = suffix;
}
//Main Method
public static void main(String[] args) {
Prac ne = new Prac();
Scanner sc = new Scanner(System.in);
System.out.println("Enter your name");
String fn = sc.nextLine();
ne.setFullName(fn);
ne.ParseName();
System.out.println("- Title: "+ne.getTitle());
System.out.println("- First Name: "+ne.getFirstName());
System.out.println("- Middle Name: "+ne.getMiddleName());
System.out.println("- Last Name: "+ne.getLastName());
System.out.println("- Suffix: "+ne.getSuffix());
}
//Extract Method
public void exWords(String fullName){
String fn = this.fullName;
String[] word1;
String[] word = new String[5];
word1 = fn.split(" ");
int i=0, k = 0;
while(i<=word1.length-1 && k<=4){
if(word1[i]==""){
i++;
continue;
}
word[k] = word1[i];
k++;
i++;
count = k+1;
}
words = word;
}
//Get Title Method
public int GetTitle()
{
ArrayList<String> c1 = new ArrayList<>();
c1.add("Mrs");
c1.add("Fr.");
c1.add("Capt.");
c1.add("Lt.");
c1.add("Gen.");
c1.add("President");
c1.add("Sister");
c1.add("Father");
c1.add("Brother");
c1.add("Sister");
c1.add("Major");
c1.add("Mr.");
c1.add("Mr");
c1.add("Ms");
c1.add("Ms.");
c1.add("Miss.");
c1.add("Miss");
c1.add("Dr");
c1.add("Dr.");
c1.add("Mrs.");
//0 - the title might be the first word only
if (words != null)
{
if (c1.contains(words[0]))
{
title = words[0];
return 0;
}
else
{
return -1;//no title
}
}
return -1;
}
//Get First Name Method
public int GetFname()
{
ArrayList<String> d1 = new ArrayList<>();
d1.add("Mrs.");
d1.add("Mrs");
d1.add("Fr.");
d1.add("Capt.");
d1.add("Lt.");
d1.add("Gen.");
d1.add("President");
d1.add("Sister");
d1.add("Father");
d1.add("Brother");
d1.add("Sister");
d1.add("Major");
d1.add("Mr.");
d1.add("Mr");
d1.add("Ms");
d1.add("Ms.");
d1.add("Miss.");
d1.add("Miss");
d1.add("Dr");
d1.add("Dr.");
if (words[0] != null && !(d1.contains(words[0])) && count>1)
{
fname = words[0];
return 0;
}
else
{
if (words[1] != null && count>1)
{
fname = words[1];
return 0;
}
else{
if (words[1] != null && count>1)
{
fname = words[1];
return 0;
}
else{
if (words[1] != null && count>1)
{
fname = words[1];
return 0;
}
else{
if (words[1] != null && count>1)
{
fname = words[1];
return 0;
}
}
}
return -1;
}
}
}
//Get Suffix Method
public int GetSuffix()
{
ArrayList<String> b1 = new ArrayList<>();
b1.add("CEO");
b1.add("CFO");
b1.add("esq");
b1.add("CPA");
b1.add("MBA");
b1.add("Phd");
b1.add("MD");
b1.add("DC");
b1.add("Sr");
b1.add("Jr");
b1.add("II");
b1.add("III");
b1.add("IV");
b1.add("DDS");
b1.add("CFA");
if (words[4] != null)
{
sfix = words[4];
return 0;
}
else
{
if ((words[3] != null) && (b1.contains(words[3])))
{
sfix = words[3];
return 0;
}
if ((words[2] != null) && (b1.contains(words[2])))
{
sfix = words[2];
return 0;
}
}
return -1;
}
//Get Last Name Method
public int GetLname()
{
ArrayList<String> a1 = new ArrayList<>();
a1.add("Mr.");
a1.add("Mr");
a1.add("Ms");
a1.add("Ms.");
a1.add("Miss.");
a1.add("Miss");
a1.add("Dr");
a1.add("Dr.");
a1.add("Mrs.");
a1.add("Mrs");
a1.add("Fr.");
a1.add("Capt.");
a1.add("Lt.");
a1.add("Gen.");
a1.add("President");
a1.add("Sister");
a1.add("Father");
a1.add("Brother");
a1.add("Sister");
a1.add("Major");
if (words[0] != null && !(a1.contains(words[0])) && count==1)
{
lanme = words[0];
return 0;
}
else
{
if (words[1] != null && !(a1.contains(words[0])) && count==2)
{
lanme = words[1];
return 0;
}
else{
if(words[1] != null && a1.contains(words[0]) && count==2){
lanme = words[1];
return 0;
}
else{
if(words[2]!=null && !(a1.contains(words[0])) && count>2){
lanme = words[2];
return 0;
}
else{
if(words[3]!=null && count>4){
lanme = words[3];
}
}
}
}
return -1;
}
}
//Get Middle Method
public int GetMname()
{
ArrayList<String> e1 = new ArrayList<>();
e1.add("Mr.");
e1.add("Mr");
e1.add("Ms");
e1.add("Ms.");
e1.add("Miss.");
e1.add("Miss");
e1.add("Dr");
e1.add("Dr.");
e1.add("Mrs.");
e1.add("Mrs");
e1.add("Fr.");
e1.add("Capt.");
e1.add("Lt.");
e1.add("Gen.");
e1.add("President");
e1.add("Sister");
e1.add("Father");
e1.add("Brother");
e1.add("Sister");
e1.add("Major");
if (words[1] != null && !(e1.contains(words[0])) && count==3)
{
mname = words[1];
return 0;
}
else
{
if (words[1] != null && !(e1.contains(words[0])) && count==4)
{
mname = words[1];
return 0;
}
else
{
if (words[2] != null && count>3)
{
mname = words[2];
return 0;
}
}
return -1;
}
}
//Parsing Method
public void ParseName()
{
//initial values
title = "";
fname = "";
mname = "";
lanme = "";
sfix = "";
//finding words
if ((fullName != null) && (fullName != ""))
{
exWords(fullName);
GetTitle();
GetFname();
GetMname();
GetLname();
GetSuffix();
}
}
}
