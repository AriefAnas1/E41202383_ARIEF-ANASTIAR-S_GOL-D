/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tv;

/**
 *
 * @author Arief Anastiar S
 */
public class TVModern extends TV {
    public TVModern(String p, String deskripsi, int jumlahChannel) {
       super(p, deskripsi, jumlahChannel);
    }
    
    static String TELETEXT = "TELETEXT";
    static String TV = "TV";
    
    /*
        TELETEXT
    */
    public void setModusTampilan(String t) {
        this.TELETEXT = t;
    }
    
    public void getModusTampilan() {
        System.out.println("Modus tampilan : " + TELETEXT);
    }
    
    public void setHalamanTeletext(int h) {
        System.out.println("Berpindah ke halaman teletext" + h);
    }
    
    /*
        CD
    */
    String cd = "";
    public void setDiscTray(String e) {
        this.cd = e;
    }
    
    public void playCD() {
        if (cd.equals("")) {
            System.out.println("Tidak ada CD di dalam disc tray!");
        }
        else {
            System.out.println("memutar film " + cd);
        }
    }
    
    public static void main(String[] args) {
        TVModern user = new TVModern( "Arief", "Polytron", 10 );
        
        String[] channel = {" RCTI ", " INDOSIAR ", " TRANS 7 ", " TV ONE ", " METRO TV ", 
                            " ANTV ", " NET ", " GTV ", " MNC ", " JTV "};
        
        user.getDeskripsi();
        user.getChannel();
        user.setChannels(channel);
        
        user.setChannelAktif( 2 );
        user.setVolume( 100 );
        user.setChannelAktif( 1 );
        user.setChannelAktif( 10 );
        
        //teletext con
        user.setModusTampilan(TVModern.TELETEXT);
        user.getModusTampilan();
        user.setHalamanTeletext(250);
        user.setModusTampilan(TVModern.TV);
        user.getModusTampilan();
        
        //CD
        user.playCD();
        user.setDiscTray("Titanic");
        user.playCD();
    }
}
