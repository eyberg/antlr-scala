// $ANTLR 3.1.1 T.g 2010-03-16 15:08:12

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class T extends Lexer {
    public static final int EOF=-1;
    public static final int ZERO=4;

    // delegates
    // delegators

    public T() {;} 
    public T(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public T(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "T.g"; }

    // $ANTLR start "ZERO"
    public final void mZERO() throws RecognitionException {
        try {
            int _type = ZERO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // T.g:3:5: ( '0' )
            // T.g:3:7: '0'
            {
            match('0'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ZERO"

    public void mTokens() throws RecognitionException {
        // T.g:1:8: ( ZERO )
        // T.g:1:10: ZERO
        {
        mZERO(); 

        }


    }


 

}