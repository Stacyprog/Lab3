

public enum   Forest {
       FIELD,
       REEDS,
       PATH,
       BRIDGE ;
       private boolean noise = false;

       public boolean getNoise() {
              return noise;
       }

       public void setNoise() {
              noise = true;
       }
}
