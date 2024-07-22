import java.util.HashMap;
import java.util.Map;

public class LocationManager  {
	Map<Integer,Location> map=new HashMap<>();
	public void addLocation(String id,String name,double latitude,double longitude) {
		int Uid=Integer.parseInt(id); 
		Location l=new Location(name,latitude,longitude);
		map.put(Uid, l);
	}
	
	public Location getLocation(String id) {
		int Uid=Integer.parseInt(id);
		return map.get(Uid);
	}
	public static void main(String[] args) {
		LocationManager lm=new LocationManager();
		lm.addLocation("2", "Work", 37.3352d, -121.8811d);
		Location location = lm.getLocation("2");
		System.out.println("Location Name: " + location.getName());
		System.out.println("Latitude: "+ location.getLatitude());
		System.out.println("Longitude: "+location.getLongitude());
	}
}
