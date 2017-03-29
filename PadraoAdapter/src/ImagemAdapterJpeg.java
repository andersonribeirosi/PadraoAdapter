
public class ImagemAdapterJpeg extends ImagemJpeg implements ImagemTarget {

	public void carregarImagem(String nomeDoArquivo) {

		jpegCarregarImagem(nomeDoArquivo);

	}

	public void desenharImagem(int posX, int posY, int largura, int altura) {

		jpegDesenharImagem(posX, posY);

	}

}
