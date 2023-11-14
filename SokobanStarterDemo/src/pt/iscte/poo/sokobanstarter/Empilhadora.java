package pt.iscte.poo.sokobanstarter;

import java.util.Random;

import pt.iscte.poo.gui.ImageTile;
import pt.iscte.poo.utils.Direction;
import pt.iscte.poo.utils.Point2D;

public class Empilhadora implements ImageTile{

	private Point2D position;
	private String imageName;
	
	public Empilhadora(Point2D initialPosition){
		position = initialPosition;
		imageName = "Empilhadora_D";
	}
	
	@Override
	public String getName() {
		return imageName;
	}

	@Override
	public Point2D getPosition() {
		return position;
	}

	@Override
	public int getLayer() {
		return 2;
	}


	
	public void moveKey(int key) {
	
		if (Direction.isDirection(key)) {
			Direction dir = Direction.directionFor(key);
			Point2D posicao = position.plus(dir.asVector());
			if (posicao.getX()>=0 && posicao.getX()<10 && 
					posicao.getY()>=0 && posicao.getY()<10 ){
					position = posicao;
				}
			
		}	
	}
	
	
	
	
}