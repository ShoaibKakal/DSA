public class DistanceBtwPoints{

    public static void main(String[] args)
    {

        int x = calcDisplacement(31.1497079, 74.3239235, 31.0972693, 74.4589738);
        System.out.println("distance is " + x + " km");
    }

    static int calcDisplacement(Double lat1, Double lng1, Double lat2, Double lng2)
    {

        int R = 6371;
        double dLat = deg2rad(lat2-lat1);
        double dLng = deg2rad(lng2-lng1);
        double a =  Math.sin(dLat/2) * Math.sin(dLat/2) +
        Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * 
        Math.sin(dLng/2) * Math.sin(dLng/2);
        
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a)); 
        double d = R * c; //distance in km
    
        return (int)d;
    }

    static Double deg2rad(double deg)
    {

        return deg*(Math.PI/180);
    }
}