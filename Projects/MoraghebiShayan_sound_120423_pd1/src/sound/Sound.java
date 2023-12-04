package sound;

import java.util.Arrays;

public class Sound
{
    /** the array of values in this sound; guaranteed not to be null */
    private int[] samples;

    public Sound( int[] vals ){
        samples = vals;
    }

    /** Changes those values in this sound that have an amplitude greater than limit.
     * Values greater than limit are changed to limit.
     * Values less than -limit are changed to -limit.
     * @param limit the amplitude limit
     * Precondition:  limit =  0
     * @return the number of values in this sound that this method changed
     */
    public int limitAmplitude(int limit){
        int cnt = 0;
        for(int i = 0; i<samples.length;i++){
            if(samples[i]>limit){
                samples[i]=limit;
                cnt++;
            }
            if(samples[i]<-limit){
                samples[i]=-limit;
                cnt++;
            }
        }
        return cnt;
    }

    /** Removes all silence from the beginning of this sound.
     * Silence is represented by a value of 0.
     * Precondition: samples contains at least one nonzero value
     * Postcondition: the length of samples reflects the removal of starting silence
     */
    public void trimSilenceFromBeginning(){
        int silenceEnd =-1;
        for(int i = 0; i < samples.length; i++){
            if(samples[i]==0){
                silenceEnd=i;
            }
            else
                break;
        }
        int[] temp = new int[samples.length-silenceEnd-1];
        int copyIndex=0;
        for(int i = silenceEnd+1;i<samples.length;i++){
            temp[copyIndex]=samples[i];
            copyIndex++;
        }
        samples=temp;
    }
    public String toString(){
        return Arrays.toString(samples);
    }
}
