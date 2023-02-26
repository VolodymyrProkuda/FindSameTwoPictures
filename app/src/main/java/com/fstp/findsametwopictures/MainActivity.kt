package com.fstp.findsametwopictures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fstp.findsametwopictures.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    var firstPictInd = 16

    var numOfChoose = 0

    val listXY = mutableListOf<Int>(0,0,1,1,2,2,3,3,4,4,5,5,6,6,7,7)
    val listXYSide = mutableListOf<Int>(8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8)
    val listOfRes = listOf<Int>(R.drawable.card_same_1,R.drawable.card_same_2,
        R.drawable.card_same_3,R.drawable.card_same_4,R.drawable.card_same_5,
        R.drawable.card_same_6,R.drawable.card_same_7,R.drawable.card_same_8,R.drawable.card_same_icon)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var rndVal = 0
        var rndValOld = 0
        var betweenVar = 0
        var i = 0
        for (i in 1..45){
            rndValOld = rndVal
            rndVal = (0..15).random()
            betweenVar = listXY[rndValOld]
            listXY[rndValOld] = listXY[rndVal]
            listXY[rndVal] =  betweenVar
        }
        binding.imageView.setOnClickListener {
           if (listXYSide[0] == 8) {
               listXYSide[0] = listXY[0]
               numOfChoose += 1
           } else {
               listXYSide[0] = 8
           }
            showAllPictures()
        }

        binding.imageView2.setOnClickListener {
            if (listXYSide[1] == 8) {
                listXYSide[1] = listXY[1]
                numOfChoose += 1
            } else {
                listXYSide[1] = 8
            }
            showAllPictures()
        }
        binding.imageView3.setOnClickListener {
            if (listXYSide[2] == 8) {
                listXYSide[2] = listXY[2]
                numOfChoose += 1
            } else {
                listXYSide[2] = 8
            }
            showAllPictures()
        }
        binding.imageView4.setOnClickListener {
            if (listXYSide[3] == 8) {
                listXYSide[3] = listXY[3]
                numOfChoose += 1
            } else {
                listXYSide[3] = 8
            }
            showAllPictures()
        }
        binding.imageView5.setOnClickListener {
            if (listXYSide[4] == 8) {
                listXYSide[4] = listXY[4]
                numOfChoose += 1
            } else {
                listXYSide[4] = 8
            }
            showAllPictures()
        }
        binding.imageView7.setOnClickListener {
            if (listXYSide[5] == 8) {
                listXYSide[5] = listXY[5]
                numOfChoose += 1
            } else {
                listXYSide[5] = 8
            }
            showAllPictures()
        }
        binding.imageView8.setOnClickListener {
            if (listXYSide[6] == 8) {
                listXYSide[6] = listXY[6]
                numOfChoose += 1
            } else {
                listXYSide[6] = 8
            }
            showAllPictures()
        }
        binding.imageView9.setOnClickListener {
            if (listXYSide[7] == 8) {
                listXYSide[7] = listXY[7]
                numOfChoose += 1
            } else {
                listXYSide[7] = 8
            }
            showAllPictures()
        }
        binding.imageView10.setOnClickListener {
            if (listXYSide[8] == 8) {
                listXYSide[8] = listXY[8]
                numOfChoose += 1
            } else {
                listXYSide[8] = 8
            }
            showAllPictures()
        }
        binding.imageView11.setOnClickListener {
            if (listXYSide[9] == 8) {
                listXYSide[9] = listXY[9]
                numOfChoose += 1
            } else {
                listXYSide[9] = 8
            }
            showAllPictures()
        }
        binding.imageView12.setOnClickListener {
            if (listXYSide[10] == 8) {
                listXYSide[10] = listXY[10]
                numOfChoose += 1
            } else {
                listXYSide[10] = 8
            }
            showAllPictures()
        }
        binding.imageView13.setOnClickListener {
            if (listXYSide[11] == 8) {
                listXYSide[11] = listXY[11]
                numOfChoose += 1
            } else {
                listXYSide[11] = 8
            }
            showAllPictures()
        }
        binding.imageView14.setOnClickListener {
            if (listXYSide[12] == 8) {
                listXYSide[12] = listXY[12]
                numOfChoose += 1
            } else {
                listXYSide[12] = 8
            }
            showAllPictures()
        }
        binding.imageView15.setOnClickListener {
            if (listXYSide[13] == 8) {
                listXYSide[13] = listXY[13]
                numOfChoose += 1
            } else {
                listXYSide[13] = 8
            }
            showAllPictures()
        }
        binding.imageView16.setOnClickListener {
            if (listXYSide[14] == 8) {
                listXYSide[14] = listXY[14]
                numOfChoose += 1
            } else {
                listXYSide[14] = 8
            }

            showAllPictures()
        }
        binding.imageView17.setOnClickListener {
            if (listXYSide[15] == 8) {
                listXYSide[15] = listXY[15]
                numOfChoose += 1
            } else {
                listXYSide[15] = 8
            }

            showAllPictures()
        }

    }
    fun showAllPictures(){

        binding.imageView.setImageResource(listOfRes[listXYSide[0]])
        binding.imageView2.setImageResource(listOfRes[listXYSide[1]])
        binding.imageView3.setImageResource(listOfRes[listXYSide[2]])
        binding.imageView4.setImageResource(listOfRes[listXYSide[3]])
        binding.imageView5.setImageResource(listOfRes[listXYSide[4]])
        binding.imageView7.setImageResource(listOfRes[listXYSide[5]])
        binding.imageView8.setImageResource(listOfRes[listXYSide[6]])
        binding.imageView9.setImageResource(listOfRes[listXYSide[7]])
        binding.imageView10.setImageResource(listOfRes[listXYSide[8]])
        binding.imageView11.setImageResource(listOfRes[listXYSide[9]])
        binding.imageView12.setImageResource(listOfRes[listXYSide[10]])
        binding.imageView13.setImageResource(listOfRes[listXYSide[11]])
        binding.imageView14.setImageResource(listOfRes[listXYSide[12]])
        binding.imageView15.setImageResource(listOfRes[listXYSide[13]])
        binding.imageView16.setImageResource(listOfRes[listXYSide[14]])
        binding.imageView17.setImageResource(listOfRes[listXYSide[15]])

    }
}