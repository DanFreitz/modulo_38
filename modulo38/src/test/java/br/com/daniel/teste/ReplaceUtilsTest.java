package br.com.daniel.teste;

import br.com.daniel.utils.ReplaceUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceUtilsTest {

    @Test
    public void replaceCPF() {
        String cpf = "333.333.333-33";
        String newCpf = ReplaceUtils.replace(cpf, ".", "-");

        assertEquals(newCpf, "22222222222");
    }

    @Test
    public void replaceTel() {
        String tel = "(73) 99299-0000";
        String newtel = ReplaceUtils.replace(tel, "(", ")", " ", "-");

        assertEquals(newtel, "11999990000");
    }
}
