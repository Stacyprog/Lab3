

public enum   Forest {
       FIELD,
       REEDS,
       PATH,
       BRIDGE ;
       static int noise;

       public int getNoise() {
              return noise;
       }

       public void setNoise(Forest place) {
              noise = place.ordinal();
       }
}