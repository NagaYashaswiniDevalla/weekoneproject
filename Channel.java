Package com.Event;
Import java.util.ArrayList;
Import java.util.list;
Public class channel 
{
	 Private List<Subscriber> Subs= new ArrayList<>();
	Private String title;
	Public void subscribe (Subscriber sub )
	{
		Subs.add(Sub);
	}
	
	Public void unsubscribe (Subscriber sub )
	{
		Subs.remove(Sub);
	}	
	Public void Notifysubscriber( )
	{
		For ( Subscriber sub : sub )
		{ Sub.update();}
	}
	
	Public void upload(String Tile )
	{
		This.title=title;
		Notifysubscriber( );
		
	}
}
