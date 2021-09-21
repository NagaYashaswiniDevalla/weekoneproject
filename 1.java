package com.telusko;
public class Youtube
{
public static void main (String [] args )
{
Channel telusko = new Channel();
Subscriber s1 = new Subcriber("Yash");
Subscriber s2 = new Subcriber("Harika");
Subscriber s3 = new Subcriber("Thanu");
Subscriber s4 = new Subcriber("Sony");
Subscriber s5 = new Subcriber("Jyoshna");
telusko.Subscribe(s1);
telusko.Subscribe(s2);
telusko.Subscribe(s3);
telusko.Subscribe(s4);
telusko.Subscribe(s5);
s1.subscribeChannel(telusko);
s2.subscribeChannel(telusko);
s3.subscribeChannel(telusko);
s4.subscribeChannel(telusko);
s5.subscribeChannel(telusko);
telusko.upload("Learn Program");
}
}