package presentationTDD;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by Jean-François Le Foll on 05/11/2015.
 */
public class FizzBuzz {
    public List<String> calculer() {

        List<String> résultat = Lists.newArrayList();

        for (int index = 0; index < 101; index++){
            String valeurAAfficher = String.valueOf(index);

            if(index % 15 == 0) {
                valeurAAfficher = "fizzBuzz";
            } else if(index % 3 == 0) {
                valeurAAfficher = "fizz";
            } else if(index % 5 == 0) {
                valeurAAfficher = "buzz";
            }

            résultat.add(valeurAAfficher);
        }

        return résultat;
    }
}
