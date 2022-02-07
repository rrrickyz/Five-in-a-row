/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gomokufx.Application.Class;

/**
 *
 * @author rickyzheng
 */

import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Chess extends Circle {
    
    Chess(int radius, Color color){
        super.setRadius(radius);
        super.setStroke(color);
        super.setFill(color);
        DropShadow ds = new DropShadow();
        ds.setOffsetX(3.0);
        super.setEffect(ds);
    }
    
}
