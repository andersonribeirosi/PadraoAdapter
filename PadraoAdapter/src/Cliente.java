public class Cliente {
	public static void main(String[] args) {
		ImagemTarget imagem = new ImagemAdapterJpeg();
		imagem.carregarImagem("teste.jpeg");
		imagem.desenharImagem(0, 0, 10, 10);

		imagem = new ImagemAdapterPng();
		imagem.carregarImagem("teste.png");
		imagem.desenharImagem(0, 0, 10, 10);
		
		imagem = new ImagemAdapterBmp();
		imagem.carregarImagem("teste.bmp");
		imagem.desenharImagem(0, 0, 10, 10);
	}
}
