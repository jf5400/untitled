public class HorseBarn{
    public Horse[] spaces;

    public HorseBarn(Horse[] spaces){
        this.spaces=spaces;
    }

    public int findHorseSpace(String name){
        int index=-1;
        for(int i=0; i<spaces.length; i++){
            if(spaces[i]!=null && name.equals(spaces[i].getName())){
                index=i;
            }
        }
        return index;
    }

    public void consolidate(){
        for(int i=0; i<spaces.length-1; i++){
            if(spaces[i]==null){
                for(int k=i+1; k<spaces.length; k++){
                    if(spaces[k]!=null){
                        spaces[i]=spaces[k];
                        spaces[k]=null;
                        k=spaces.length;
                    }
                }
            }
        }
    }
    public String toString(){
        String order="";
        for(int i=0; i<spaces.length; i++){
            if(spaces[i]==null){
                order+= "["+ null +"] ";
            }
            else{
                order+= "["+spaces[i].getName()+"] ";
            }
        }
        return order;
    }
}
