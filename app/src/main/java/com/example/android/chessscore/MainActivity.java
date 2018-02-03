package com.example.android.chessscore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int whiteTotal = 39;
    int blackTotal = 39;
    int pawnsW = 8;
    int pawnsValue = 1;
    int knightsW = 2;
    int knightsValue = 3;
    int bishopsW = 2;
    int bishopsValue = 3;
    int rooksW = 2;
    int rooksValue = 5;
    int queensW = 1;
    int queensValue = 9;
    int promotionModifier = 0;
    int score = 0;
    int pawnsB = 8;
    int knightsB = 2;
    int bishopsB = 2;
    int rooksB = 2;
    int queensB = 1;
    String messageTop = "Let the battle begin!";
    String messageBottom = "The position is equal.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayTextTop(messageTop);
        displayTextBottom(messageBottom);
    }

    //press PAWNS button as white
    public void pressPawnsW(View view) {
        if (promotionModifier % 2 == 0) {
            if (pawnsW > 0) {
                pawnsW = pawnsW - 1;
                whiteTotal = whiteTotal - pawnsValue;
                score = whiteTotal - blackTotal;
                messageTop = "White's pawn was taken";
                displayTextTop(messageTop);
                displayScore(score);
                displayPawnsW(pawnsW);
                if (score == 0) {
                    messageBottom = "The position is equal";
                } else if (score == 1) {
                    messageBottom = "White is " + score + " point ahead!";
                } else if (score > 1) {
                    messageBottom = "White is " + score + " points ahead!";
                } else if (score == -1) {
                    int minusScore = -score;
                    messageBottom = "Black is " + minusScore + " point ahead!";
                } else {
                    int minusScore = -score;
                    messageBottom = "Black is " + minusScore + " points ahead!";
                }
                displayTextBottom(messageBottom);
            } else {
                messageTop = "There are no white pawns!";
                displayTextTop(messageTop);
            }
        } else {
            pawnsW = pawnsW - 0;
            pawnsW = pawnsW + 0;
            whiteTotal = whiteTotal + 0;
            score = whiteTotal - blackTotal;
            displayScore(score);
            messageTop = "White promoted a pawn to a pawn!";
            promotionModifier = 0;
            if (score == 0) {
                messageBottom = "The position is equal";
            } else if (score == 1) {
                messageBottom = "White is " + score + " point ahead!";
            } else if (score > 1) {
                messageBottom = "White is " + score + " points ahead!";
            } else if (score == -1) {
                int minusScore = -score;
                messageBottom = "Black is " + minusScore + " point ahead!";
            } else {
                int minusScore = -score;
                messageBottom = "Black is " + minusScore + " points ahead!";
            }
            displayTextBottom(messageBottom);
            displayTextTop(messageTop);
            displayPawnsW(pawnsW);
        }

    }

    //press KNIGHTS button as white
    public void pressKnightsW(View view) {
        if (promotionModifier % 2 == 0) {
            if (knightsW > 0) {
                knightsW = knightsW - 1;
                whiteTotal = whiteTotal - knightsValue;
                score = whiteTotal - blackTotal;
                messageTop = "White's knight was taken";
                displayTextTop(messageTop);
                displayScore(score);
                displayKnightsW(knightsW);
                if (score == 0) {
                    messageBottom = "The position is equal";
                } else if (score == 1) {
                    messageBottom = "White is " + score + " point ahead!";
                } else if (score > 1) {
                    messageBottom = "White is " + score + " points ahead!";
                } else if (score == -1) {
                    int minusScore = -score;
                    messageBottom = "Black is " + minusScore + " point ahead!";
                } else {
                    int minusScore = -score;
                    messageBottom = "Black is " + minusScore + " points ahead!";
                }
                displayTextBottom(messageBottom);
            } else {
                messageTop = "There are no white knights!";
                displayTextTop(messageTop);
            }
        } else {
            pawnsW = pawnsW - 1;
            knightsW = knightsW + 1;
            whiteTotal = whiteTotal + knightsValue - pawnsValue;
            score = whiteTotal - blackTotal;
            displayScore(score);
            messageTop = "White promoted a pawn to a knight!";
            promotionModifier = 0;
            if (score == 0) {
                messageBottom = "The position is equal";
            } else if (score == 1) {
                messageBottom = "White is " + score + " point ahead!";
            } else if (score > 1) {
                messageBottom = "White is " + score + " points ahead!";
            } else if (score == -1) {
                int minusScore = -score;
                messageBottom = "Black is " + minusScore + " point ahead!";
            } else {
                int minusScore = -score;
                messageBottom = "Black is " + minusScore + " points ahead!";
            }
            displayTextBottom(messageBottom);
            displayTextTop(messageTop);
            displayKnightsW(knightsW);
            displayPawnsW(pawnsW);
        }
    }

    //press BISHOPS button as white
    public void pressBishopsW(View view) {
        if (promotionModifier % 2 == 0) {
            if (bishopsW > 0) {
                bishopsW = bishopsW - 1;
                whiteTotal = whiteTotal - bishopsValue;
                score = whiteTotal - blackTotal;
                messageTop = "White's bishop was taken";
                displayTextTop(messageTop);
                displayScore(score);
                displayBishopsW(bishopsW);
                if (score == 0) {
                    messageBottom = "The position is equal";
                } else if (score == 1) {
                    messageBottom = "White is " + score + " point ahead!";
                } else if (score > 1) {
                    messageBottom = "White is " + score + " points ahead!";
                } else if (score == -1) {
                    int minusScore = -score;
                    messageBottom = "Black is " + minusScore + " point ahead!";
                } else {
                    int minusScore = -score;
                    messageBottom = "Black is " + minusScore + " points ahead!";
                }
                displayTextBottom(messageBottom);
            } else {
                messageTop = "There are no white bishops!";
                displayTextTop(messageTop);
            }
        } else {
            pawnsW = pawnsW - 1;
            bishopsW = bishopsW + 1;
            whiteTotal = whiteTotal + bishopsValue - pawnsValue;
            score = whiteTotal - blackTotal;
            displayScore(score);
            messageTop = "White promoted a pawn to a bishop!";
            promotionModifier = 0;
            if (score == 0) {
                messageBottom = "The position is equal";
            } else if (score == 1) {
                messageBottom = "White is " + score + " point ahead!";
            } else if (score > 1) {
                messageBottom = "White is " + score + " points ahead!";
            } else if (score == -1) {
                int minusScore = -score;
                messageBottom = "Black is " + minusScore + " point ahead!";
            } else {
                int minusScore = -score;
                messageBottom = "Black is " + minusScore + " points ahead!";
            }
            displayTextBottom(messageBottom);
            displayTextTop(messageTop);
            displayBishopsW(bishopsW);
            displayPawnsW(pawnsW);
        }
    }

    //press ROOKS button as white
    public void pressRooksW(View view) {
        if (promotionModifier % 2 == 0) {
            if (rooksW > 0) {
                rooksW = rooksW - 1;
                whiteTotal = whiteTotal - rooksValue;
                score = whiteTotal - blackTotal;
                messageTop = "White's rook was taken";
                displayTextTop(messageTop);
                displayScore(score);
                displayRooksW(rooksW);
                if (score == 0) {
                    messageBottom = "The position is equal";
                } else if (score == 1) {
                    messageBottom = "White is " + score + " point ahead!";
                } else if (score > 1) {
                    messageBottom = "White is " + score + " points ahead!";
                } else if (score == -1) {
                    int minusScore = -score;
                    messageBottom = "Black is " + minusScore + " point ahead!";
                } else {
                    int minusScore = -score;
                    messageBottom = "Black is " + minusScore + " points ahead!";
                }
                displayTextBottom(messageBottom);
            } else {
                messageTop = "There are no white rooks!";
                displayTextTop(messageTop);
            }
        } else {
            pawnsW = pawnsW - 1;
            rooksW = rooksW + 1;
            whiteTotal = whiteTotal + rooksValue - pawnsValue;
            score = whiteTotal - blackTotal;
            displayScore(score);
            messageTop = "White promoted a pawn to a rook!";
            promotionModifier = 0;
            if (score == 0) {
                messageBottom = "The position is equal";
            } else if (score == 1) {
                messageBottom = "White is " + score + " point ahead!";
            } else if (score > 1) {
                messageBottom = "White is " + score + " points ahead!";
            } else if (score == -1) {
                int minusScore = -score;
                messageBottom = "Black is " + minusScore + " point ahead!";
            } else {
                int minusScore = -score;
                messageBottom = "Black is " + minusScore + " points ahead!";
            }
            displayTextBottom(messageBottom);
            displayTextTop(messageTop);
            displayRooksW(rooksW);
            displayPawnsW(pawnsW);
        }
    }

    //press Queens button as white
    public void pressQueensW(View view) {
        if (promotionModifier % 2 == 0) {
            if (queensW > 0) {
                queensW = queensW - 1;
                whiteTotal = whiteTotal - queensValue;
                score = whiteTotal - blackTotal;
                messageTop = "White's queen was taken";
                displayTextTop(messageTop);
                displayScore(score);
                displayQueensW(queensW);
                if (score == 0) {
                    messageBottom = "The position is equal";
                } else if (score == 1) {
                    messageBottom = "White is " + score + " point ahead!";
                } else if (score > 1) {
                    messageBottom = "White is " + score + " points ahead!";
                } else if (score == -1) {
                    int minusScore = -score;
                    messageBottom = "Black is " + minusScore + " point ahead!";
                } else {
                    int minusScore = -score;
                    messageBottom = "Black is " + minusScore + " points ahead!";
                }
                displayTextBottom(messageBottom);
            } else {
                messageTop = "There are no white queens!";
                displayTextTop(messageTop);
            }
        } else {
            pawnsW = pawnsW - 1;
            queensW = queensW + 1;
            whiteTotal = whiteTotal + queensValue - pawnsValue;
            score = whiteTotal - blackTotal;
            displayScore(score);
            messageTop = "White promoted a pawn to a queen!";
            promotionModifier = 0;
            if (score == 0) {
                messageBottom = "The position is equal";
            } else if (score == 1) {
                messageBottom = "White is " + score + " point ahead!";
            } else if (score > 1) {
                messageBottom = "White is " + score + " points ahead!";
            } else if (score == -1) {
                int minusScore = -score;
                messageBottom = "Black is " + minusScore + " point ahead!";
            } else {
                int minusScore = -score;
                messageBottom = "Black is " + minusScore + " points ahead!";
            }
            displayTextBottom(messageBottom);
            displayTextTop(messageTop);
            displayQueensW(queensW);
            displayPawnsW(pawnsW);
        }
    }

    //press PAWNS button as black
    public void pressPawnsB(View view) {
        if (promotionModifier % 2 == 0) {
            if (pawnsB > 0) {
                pawnsB = pawnsB - 1;
                blackTotal = blackTotal - pawnsValue;
                score = whiteTotal - blackTotal;
                messageTop = "Black's pawn was taken";
                displayTextTop(messageTop);
                displayScore(score);
                displayPawnsB(pawnsB);
                if (score == 0) {
                    messageBottom = "The position is equal";
                } else if (score == 1) {
                    messageBottom = "White is " + score + " point ahead!";
                } else if (score > 1) {
                    messageBottom = "White is " + score + " points ahead!";
                } else if (score == -1) {
                    int minusScore = -score;
                    messageBottom = "Black is " + minusScore + " point ahead!";
                } else {
                    int minusScore = -score;
                    messageBottom = "Black is " + minusScore + " points ahead!";
                }
                displayTextBottom(messageBottom);
            } else {
                messageTop = "There are no black pawns!";
                displayTextTop(messageTop);
            }
        } else {
            pawnsB = pawnsB - 0;
            pawnsB = pawnsB + 0;
            blackTotal = blackTotal + 0;
            score = whiteTotal - blackTotal;
            displayScore(score);
            messageTop = "Black promoted a pawn to a pawn!";
            promotionModifier = 0;
            if (score == 0) {
                messageBottom = "The position is equal";
            } else if (score == 1) {
                messageBottom = "White is " + score + " point ahead!";
            } else if (score > 1) {
                messageBottom = "White is " + score + " points ahead!";
            } else if (score == -1) {
                int minusScore = -score;
                messageBottom = "Black is " + minusScore + " point ahead!";
            } else {
                int minusScore = -score;
                messageBottom = "Black is " + minusScore + " points ahead!";
            }
            displayTextBottom(messageBottom);
            displayTextTop(messageTop);
            displayPawnsB(pawnsB);
        }
    }

    //press KNIGHTS button as black
    public void pressKnightsB(View view) {
        if (promotionModifier % 2 == 0) {
            if (knightsB > 0) {
                knightsB = knightsB - 1;
                blackTotal = blackTotal - knightsValue;
                score = whiteTotal - blackTotal;
                messageTop = "Black's knight was taken";
                displayTextTop(messageTop);
                displayScore(score);
                displayKnightsB(knightsB);
                if (score == 0) {
                    messageBottom = "The position is equal";
                } else if (score == 1) {
                    messageBottom = "White is " + score + " point ahead!";
                } else if (score > 1) {
                    messageBottom = "White is " + score + " points ahead!";
                } else if (score == -1) {
                    int minusScore = -score;
                    messageBottom = "Black is " + minusScore + " point ahead!";
                } else {
                    int minusScore = -score;
                    messageBottom = "Black is " + minusScore + " points ahead!";
                }
                displayTextBottom(messageBottom);
            } else {
                messageTop = "There are black no knights!";
                displayTextTop(messageTop);
            }
        } else {
            pawnsB = pawnsB - 1;
            knightsB = knightsB + 1;
            blackTotal = blackTotal + knightsValue - pawnsValue;
            score = whiteTotal - blackTotal;
            displayScore(score);
            messageTop = "Black promoted a pawn to a knight!";
            promotionModifier = 0;
            if (score == 0) {
                messageBottom = "The position is equal";
            } else if (score == 1) {
                messageBottom = "White is " + score + " point ahead!";
            } else if (score > 1) {
                messageBottom = "White is " + score + " points ahead!";
            } else if (score == -1) {
                int minusScore = -score;
                messageBottom = "Black is " + minusScore + " point ahead!";
            } else {
                int minusScore = -score;
                messageBottom = "Black is " + minusScore + " points ahead!";
            }
            displayTextBottom(messageBottom);
            displayTextTop(messageTop);
            displayKnightsB(knightsB);
            displayPawnsB(pawnsB);
        }
    }

    //press BISHOPS button as black
    public void pressBishopsB(View view) {
        if (promotionModifier % 2 == 0) {
            if (bishopsB > 0) {
                bishopsB = bishopsB - 1;
                blackTotal = blackTotal - bishopsValue;
                score = whiteTotal - blackTotal;
                messageTop = "Black's bishop was taken";
                displayTextTop(messageTop);
                displayScore(score);
                displayBishopsB(bishopsB);
                if (score == 0) {
                    messageBottom = "The position is equal";
                } else if (score == 1) {
                    messageBottom = "White is " + score + " point ahead!";
                } else if (score > 1) {
                    messageBottom = "White is " + score + " points ahead!";
                } else if (score == -1) {
                    int minusScore = -score;
                    messageBottom = "Black is " + minusScore + " point ahead!";
                } else {
                    int minusScore = -score;
                    messageBottom = "Black is " + minusScore + " points ahead!";
                }
                displayTextBottom(messageBottom);
            } else {
                messageTop = "There are no black bishops!";
                displayTextTop(messageTop);
            }
        } else {
            pawnsB = pawnsB - 1;
            bishopsB = bishopsB + 1;
            blackTotal = blackTotal + bishopsValue - pawnsValue;
            score = whiteTotal - blackTotal;
            displayScore(score);
            messageTop = "Black promoted a pawn to a bishop!";
            promotionModifier = 0;
            if (score == 0) {
                messageBottom = "The position is equal";
            } else if (score == 1) {
                messageBottom = "White is " + score + " point ahead!";
            } else if (score > 1) {
                messageBottom = "White is " + score + " points ahead!";
            } else if (score == -1) {
                int minusScore = -score;
                messageBottom = "Black is " + minusScore + " point ahead!";
            } else {
                int minusScore = -score;
                messageBottom = "Black is " + minusScore + " points ahead!";
            }
            displayTextBottom(messageBottom);
            displayTextTop(messageTop);
            displayBishopsB(bishopsB);
            displayPawnsB(pawnsB);
        }
    }

    //press ROOKS button as black
    public void pressRooksB(View view) {
        if (promotionModifier % 2 == 0) {
            if (rooksB > 0) {
                rooksB = rooksB - 1;
                blackTotal = blackTotal - rooksValue;
                score = whiteTotal - blackTotal;
                messageTop = "Black's rook was taken";
                displayTextTop(messageTop);
                displayScore(score);
                displayRooksB(rooksB);
                if (score == 0) {
                    messageBottom = "The position is equal";
                } else if (score == 1) {
                    messageBottom = "White is " + score + " point ahead!";
                } else if (score > 1) {
                    messageBottom = "White is " + score + " points ahead!";
                } else if (score == -1) {
                    int minusScore = -score;
                    messageBottom = "Black is " + minusScore + " point ahead!";
                } else {
                    int minusScore = -score;
                    messageBottom = "Black is " + minusScore + " points ahead!";
                }
                displayTextBottom(messageBottom);
            } else {
                messageTop = "There are no black rooks!";
                displayTextTop(messageTop);
            }
        } else {
            pawnsB = pawnsB - 1;
            rooksB = rooksB + 1;
            blackTotal = blackTotal + rooksValue - pawnsValue;
            score = whiteTotal - blackTotal;
            displayScore(score);
            messageTop = "Black promoted a pawn to a rook!";
            promotionModifier = 0;
            if (score == 0) {
                messageBottom = "The position is equal";
            } else if (score == 1) {
                messageBottom = "White is " + score + " point ahead!";
            } else if (score > 1) {
                messageBottom = "White is " + score + " points ahead!";
            } else if (score == -1) {
                int minusScore = -score;
                messageBottom = "Black is " + minusScore + " point ahead!";
            } else {
                int minusScore = -score;
                messageBottom = "Black is " + minusScore + " points ahead!";
            }
            displayTextBottom(messageBottom);
            displayTextTop(messageTop);
            displayRooksB(rooksB);
            displayPawnsB(pawnsB);
        }
    }

    //press Queens button as black
    public void pressQueensB(View view) {
        if (promotionModifier % 2 == 0) {
            if (queensB > 0) {
                queensB = queensB - 1;
                blackTotal = blackTotal - queensValue;
                score = whiteTotal - blackTotal;
                messageTop = "Black's queen was taken";
                displayTextTop(messageTop);
                displayScore(score);
                displayQueensB(queensB);
                if (score == 0) {
                    messageBottom = "The position is equal";
                } else if (score == 1) {
                    messageBottom = "White is " + score + " point ahead!";
                } else if (score > 1) {
                    messageBottom = "White is " + score + " points ahead!";
                } else if (score == -1) {
                    int minusScore = -score;
                    messageBottom = "Black is " + minusScore + " point ahead!";
                } else {
                    int minusScore = -score;
                    messageBottom = "Black is " + minusScore + " points ahead!";
                }
                displayTextBottom(messageBottom);
            } else {
                messageTop = "There are no black queens!";
                displayTextTop(messageTop);
            }
        } else {
            pawnsB = pawnsB - 1;
            queensB = queensB + 1;
            blackTotal = blackTotal + queensValue - pawnsValue;
            score = whiteTotal - blackTotal;
            displayScore(score);
            messageTop = "Black promoted a pawn to a queen!";
            promotionModifier = 0;
            if (score == 0) {
                messageBottom = "The position is equal";
            } else if (score == 1) {
                messageBottom = "White is " + score + " point ahead!";
            } else if (score > 1) {
                messageBottom = "White is " + score + " points ahead!";
            } else if (score == -1) {
                int minusScore = -score;
                messageBottom = "Black is " + minusScore + " point ahead!";
            } else {
                int minusScore = -score;
                messageBottom = "Black is " + minusScore + " points ahead!";
            }
            displayTextBottom(messageBottom);
            displayTextTop(messageTop);
            displayQueensB(queensB);
            displayPawnsB(pawnsB);
        }
    }

    //press PROMOTION button
    public void promotion(View view) {
        if (pawnsW == 0) {
            messageTop = "There are no pawns to promote!";
            displayTextTop(messageTop);
        } else {
            promotionModifier = promotionModifier + 1;
            if (promotionModifier % 2 == 0) {
                messageTop = "Take some piece!";
                displayTextTop(messageTop);
            } else {
                messageTop = "Promote a pawn to...";
                displayTextTop(messageTop);
            }
        }
    }

    //press NEW GAME button
    public void pressNewGame(View view) {
        whiteTotal = 39;
        blackTotal = 39;
        pawnsW = 8;
        pawnsValue = 1;
        knightsW = 2;
        knightsValue = 3;
        bishopsW = 2;
        bishopsValue = 3;
        rooksW = 2;
        rooksValue = 5;
        queensW = 1;
        queensValue = 9;
        promotionModifier = 0;
        score = 0;
        pawnsB = 8;
        knightsB = 2;
        bishopsB = 2;
        rooksB = 2;
        queensB = 1;
        messageTop = "Let the battle begin!";
        messageBottom = "The position is equal.";
        displayTextTop(messageTop);
        displayTextBottom(messageBottom);
        displayScore(score);
        displayPawnsW(pawnsW);
        displayKnightsW(knightsW);
        displayBishopsW(bishopsW);
        displayRooksW(rooksW);
        displayQueensW(queensW);
        displayPawnsB(pawnsB);
        displayKnightsB(knightsB);
        displayBishopsB(bishopsB);
        displayRooksB(rooksB);
        displayQueensB(queensB);
    }
    //displays score
    public void displayScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score);
        scoreView.setText(String.valueOf(score));
    }

    //displays text on the very top
    public void displayTextTop(String messageTop) {
        TextView scoreView = (TextView) findViewById(R.id.score_text);
        scoreView.setText(String.valueOf(messageTop));
    }

    //display info text
    public void displayTextBottom(String messageBottom) {
        TextView scoreView = (TextView) findViewById(R.id.info_text);
        scoreView.setText(String.valueOf(messageBottom));
    }

    //display white's pawns number
    public void displayPawnsW(int pawnsW) {
        TextView scoreView = (TextView) findViewById(R.id.pawns_w_number);
        scoreView.setText(String.valueOf(pawnsW));
    }

    //display black's pawns number
    public void displayPawnsB(int pawnsB) {
        TextView scoreView = (TextView) findViewById(R.id.pawns_b_number);
        scoreView.setText(String.valueOf(pawnsB));
    }

    //display white's knights number
    public void displayKnightsW(int knightsW) {
        TextView scoreView = (TextView) findViewById(R.id.knights_w_number);
        scoreView.setText(String.valueOf(knightsW));
    }

    //display black's knights number
    public void displayKnightsB(int knightsB) {
        TextView scoreView = (TextView) findViewById(R.id.knights_b_number);
        scoreView.setText(String.valueOf(knightsB));
    }

    //display white's bishops number
    public void displayBishopsW(int bishopsW) {
        TextView scoreView = (TextView) findViewById(R.id.bishops_w_number);
        scoreView.setText(String.valueOf(bishopsW));
    }

    //display black's bishops number
    public void displayBishopsB(int bishopsB) {
        TextView scoreView = (TextView) findViewById(R.id.bishops_b_number);
        scoreView.setText(String.valueOf(bishopsB));
    }

    //display white's rooks number
    public void displayRooksW(int rooksW) {
        TextView scoreView = (TextView) findViewById(R.id.rooks_w_number);
        scoreView.setText(String.valueOf(rooksW));
    }

    //display black's rooks number
    public void displayRooksB(int rooksB) {
        TextView scoreView = (TextView) findViewById(R.id.rooks_b_number);
        scoreView.setText(String.valueOf(rooksB));
    }

    //display white's queens number
    public void displayQueensW(int queensW) {
        TextView scoreView = (TextView) findViewById(R.id.queens_w_number);
        scoreView.setText(String.valueOf(queensW));
    }

    //display black's queens number
    public void displayQueensB(int queensB) {
        TextView scoreView = (TextView) findViewById(R.id.queens_b_number);
        scoreView.setText(String.valueOf(queensB));
    }
}
