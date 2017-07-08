package interfaces;

import com.example.stuartbryce.fruitmachine.Symbol;
import com.example.stuartbryce.fruitmachine.SymbolPack;

import java.util.ArrayList;

/**
 * Created by stuartbryce on 2017-07-08.
 */

public interface Packable {

    ArrayList<Symbol> pack = new ArrayList<>();

    ArrayList<Symbol> getPack();


}
