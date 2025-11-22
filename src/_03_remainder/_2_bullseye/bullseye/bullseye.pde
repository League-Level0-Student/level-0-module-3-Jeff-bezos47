
void setup() {
 
  // set the size of your sketch
  size(800, 800);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int loop=8; loop>0; loop--){
    if(loop % 2 ==0){
      fill(#FF0000);
      ellipse(400,400, 100*loop, 100*loop);
    }
    if(loop % 2 == 1){
      fill(0);
      ellipse(400,400, 100*loop, 100*loop);
    }
   
  }
  
  
  //Use an if statement and remainder to alternate the color of your rings.
  
  
}
