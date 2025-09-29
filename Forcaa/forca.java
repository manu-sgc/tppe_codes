public class forca {
    private final String palavra;

    public forca(String palavra) {
        this.palavra = palavra;
    }

    public String revelar(char c) {
        if (c == '\0' || Character.isWhitespace(c)) {
            throw new CaractereInvalidoException("Caractere inválido");
        }
        StringBuilder sb = new StringBuilder();
        for (char letra : palavra.toCharArray()) {
            if (letra == c) {
                sb.append(c);
            } else {
                sb.append('*');
            }
        }
        return sb.toString();
    }

    public int contarOcorrencias(char c) {
        if (c == '\0' || Character.isWhitespace(c)) {
            throw new CaractereInvalidoException("Caractere inválido");
        }
        int count = 0;
        for (char letra : palavra.toCharArray()) {
            if (letra == c) {
                count++;
            }
        }
        return count;
    }
}