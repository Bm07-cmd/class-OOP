class Enemy{
    private String file;
    
    int x = 0;
    int y = 0;
    int w = 0;
    int h = 0;
    
    Enemy(int x, int y, int w, int h){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    
    public void setTexture(String f){
        this.file = f;
    }
    
    public String getTexture(){
        return this.file;
    }
    
    public void attack(){
        System.out.println("SLASH!!!");
    }
}


class Dragon extends Enemy{
    Dragon(int x, int y, int w, int h){
        super(x,y,w,h);
        
    }
    
    @Override
    public void attack(){
        System.out.println("ROAR!");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Enemy skeleton = new Enemy(100,200,50,50);
    
        System.out.println("skeleton x "+ skeleton.x);
        skeleton.setTexture("/sprites/skeleton.png");
        
        System.out.println("skeleton texture is lcated at: "+ skeleton.getTexture());
        
        Dragon mid_boss = new Dragon(0,0,300,300);
        
        mid_boss.setTexture("/sprites/dragon.png");
        
        System.out.println("dragon texture is lcated at: "+ mid_boss.getTexture());
        
        
    }
}
