
public class ImagemAdapterPng extends ImagemPng implements ImagemTarget {

	@Override
	public void carregarImagem(String nomeDoArquivo) {

		pngCarregarImagem(nomeDoArquivo);

	}

	@Override
	public void desenharImagem(int posX, int posY, int largura, int altura) {

		pngDesenharImagem(posX, posY);
	}

}
