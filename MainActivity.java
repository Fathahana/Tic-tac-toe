package com.example.mubin.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

    int turn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);

        turn = 1;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b1.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b1.setText("O");
                    }
                }
                endGame();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b2.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b2.setText("O");
                    }
                }

                endGame();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b3.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b3.setText("O");
                    }
                }
                endGame();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (b4.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b4.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b4.setText("O");
                    }
                }
                endGame();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b5.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b5.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b5.setText("O");
                    }
                }
                endGame();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b6.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b6.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b6.setText("O");
                    }
                }
                endGame();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b7.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b7.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b7.setText("O");
                    }
                }
                endGame();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b8.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b8.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b8.setText("O");
                    }
                }
                endGame();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b9.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b9.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b9.setText("O");
                    }
                }
                endGame();
            }
        });

    }

    public void endGame() {
        String a, b, c, d, e, f, g, h, i;
        boolean end = false;
        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();
        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();
        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();

        if (a.equals(b) && a.equals(c) && a.equals("X")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER X", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a.equals(e) && a.equals(i) && a.equals("X")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER X", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (a.equals(d) && a.equals(g) && a.equals("X")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER X", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (b.equals(a) && b.equals(c) && b.equals("X")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER X", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (b.equals(e) && b.equals(h) && b.equals("X")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER X", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (c.equals(a) && c.equals(b) && c.equals("X")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER X", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (c.equals(e) && c.equals(g) && c.equals("X")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER X", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (c.equals(f) && c.equals(i) && c.equals("X")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER X", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (d.equals(a) && d.equals(g) && d.equals("X")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER X", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (d.equals(e) && d.equals(f) && d.equals("X")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER X", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (e.equals(d) && e.equals(f) && e.equals("X")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER X", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (e.equals(b) && e.equals(h) && e.equals("X")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER X", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (e.equals(a) && e.equals(i) && e.equals("X")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER X", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (e.equals(c) && e.equals(g) && e.equals("X")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER X", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (f.equals(d) && f.equals(e) && f.equals("X")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER X", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (f.equals(c) && f.equals(i) && f.equals("X")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER X", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (g.equals(a) && g.equals(d) && g.equals("X")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER X", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (g.equals(h) && g.equals(i) && g.equals("X")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER X", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (g.equals(e) && g.equals(c) && g.equals("X")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER X", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (h.equals(g) && h.equals(i) && h.equals("X")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER X", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (h.equals(e) && h.equals(b) && h.equals("X")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER X", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (i.equals(g) && i.equals(h) && i.equals("X")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER X", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (i.equals(f) && i.equals(c) && i.equals("X")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER X", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (i.equals(e) && i.equals(a) && i.equals("X")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER X", Toast.LENGTH_LONG).show();
            end = true;

        }
//o player
        if (a.equals(b) && a.equals(c) && a.equals("O")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER O", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (a.equals(e) && a.equals(i) && a.equals("O")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER O", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (a.equals(d) && a.equals(g) && a.equals("O")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER O", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (b.equals(a) && b.equals(c) && b.equals("O")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER O", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (b.equals(e) && b.equals(h) && b.equals("O")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER O", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (c.equals(a) && c.equals(b) && c.equals("O")) {


            Toast.makeText(MainActivity.this, "WINNER PLAYER O", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (c.equals(e) && c.equals(g) && c.equals("O")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER O", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (c.equals(f) && c.equals(i) && c.equals("O")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER O", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (d.equals(a) && d.equals(g) && d.equals("O")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER O", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (d.equals(e) && d.equals(f) && d.equals("O")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER O", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (e.equals(d) && e.equals(f) && e.equals("O")) {

            Toast.makeText(MainActivity.this, "WINNER PLAYER O", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e.equals(b) && e.equals(h) && e.equals("O")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER O", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e.equals(a) && e.equals(i) && e.equals("O")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER O", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e.equals(c) && e.equals(g) && e.equals("O")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER O", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f.equals(d) && f.equals(e) && f.equals("O")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER O", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f.equals(c) && f.equals(i) && f.equals("O")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER O", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (g.equals(a) && g.equals(d) && g.equals("O")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER O", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (g.equals(h) && g.equals(i) && g.equals("O")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER O", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (g.equals(e) && g.equals(c) && g.equals("O")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER O", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (h.equals(g) && h.equals(i) && h.equals("O")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER O", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (h.equals(e) && h.equals(b) && h.equals("O")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER O", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (i.equals(g) && i.equals(h) && i.equals("O")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER O", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (i.equals(f) && i.equals(c) && i.equals("O")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER O", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (i.equals(e) && i.equals(a) && i.equals("O")) {
            Toast.makeText(MainActivity.this, "WINNER PLAYER O", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (end) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);

        }

    }

}