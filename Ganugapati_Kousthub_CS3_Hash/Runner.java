public class Runner
{
    static final int SIZE = 800;
    public static void main(String[] args)
    {
        
        StdDraw.setCanvasSize(SIZE, SIZE);
        StdDraw.setXscale(-1, 1);
        StdDraw.setYscale(-1, 1);
        StarChart sChart = new StarChart("/Users/pigeon/Downloads/Star and Constellation Data/stars.txt");
        sChart.drawStars();
        sChart.drawConstellation("/Users/pigeon/Downloads/Star and Constellation Data/Big Dipper.txt");
        sChart.drawConstellation("/Users/pigeon/Downloads/Star and Constellation Data/Bootes.txt");
        sChart.drawConstellation("/Users/pigeon/Downloads/Star and Constellation Data/Cassiopeia.txt");
        sChart.drawConstellation("/Users/pigeon/Downloads/Star and Constellation Data/Cygnet.txt");
        sChart.drawConstellation("/Users/pigeon/Downloads/Star and Constellation Data/Gemini.txt");
        sChart.drawConstellation("/Users/pigeon/Downloads/Star and Constellation Data/Hydra.txt");
        sChart.drawConstellation("/Users/pigeon/Downloads/Star and Constellation Data/Ursa Major.txt");
        sChart.drawConstellation("/Users/pigeon/Downloads/Star and Constellation Data/Ursa Minor.txt");
        
    }
    
}
