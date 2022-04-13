class WhatsApp
{
String s="Hi";
public void chat()
{
System.out.println("messenge send");
}
}
class Status extends WhatsApp
{
public void upload()
{
System.out.println("photo uploaded");
}
public void delete()
{
System.out.println("photo deleted");
}
}
class MainClass
{
public static void main(String[] args)
{
Status s=new Status();
s.upload();
s.chat();
s.ddelete();
}
}