package rules



interface Inv<T> // in T_in out T_out

interface In<in T> // in T out Any?

interface Out<out T> // in Nothing out T

interface InvInv<T> : Inv<T> // in T_in -> Inv.T_in |- out T_out -> Inv.T_out

interface InOut<in T> : Out<T> // in T_in -> not mapped |- out Nothing |- Error: Out.T_out not mapped
interface OutIn<out T> : In<T> // same case

interface OutOut<out T> : Out<T> // in Nothing |- out T -> Out.T
interface InIn<in T> : In<T>

interface InvIn<T> : In<T> // in T_in -> In.T |- out T_out -> not mapped
interface InvOut<T> : Out<T>
