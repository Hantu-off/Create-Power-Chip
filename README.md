Circuits inside your circuits! :3

A Create: Power Grid addon that lets you pack an entire circuit design into a single placeable Chip.

Design a circuit once, turn it into a compact 8-pin chip, and reuse it anywhere even inside other chips! :3

![Xor chip :3](https://cdn.modrinth.com/data/cached_images/4886adc458f48e58818459aad76996d61f9487da.png)

![Definition of hell](https://cdn.modrinth.com/data/cached_images/a19684687b1a613db88b39ad267ba9b956591ff5.png)

**How It Works :3**

**Design Your Circuit**

Build your circuit as normal on a Circuit Design Table. This is your "source" design; anything you can wire up here can become a chip.
**Define the Chip's Pins**

Your chip talks to the outside world through I/O Pins. Use a Gold Nugget to place IO Pin components in your design, then assign each one a pin number (1-8). These become the physical contacts on the finished chip.

![I/O settings](https://cdn.modrinth.com/data/cached_images/92c892194d279004b07ba25959f5aa8920c16551.png)

**Name Your Chip (Optional)**

![Name tag settings](https://cdn.modrinth.com/data/cached_images/1fb34f676a3d757e068501ef9f337ab4d0dbe62d.png)

**Craft the Chip**

Take your design (as a Circuit Board carrying the schematic data) and run it through a Sequenced Assembly line using Create machinery:

1. Deploy an Iron Sheet onto the board.
2. Press it **TWICE**.
3. Deploy a Chip Casing.

The schematic data is carried along at every step of assembly, so the finished Chip "remembers" the exact circuit you designed. When it pops out, it's automatically named after your Chip Name component (or "CHIP" by default).

**Use It Anywhere**

Place the finished Chip item into another circuit design just like a normal component. Its 8 pads map to the internal pins you defined. When the grid simulates, the chip expands into its full internal circuit behind the scenes.
Chips Inside Chips! :3

You can place chips inside other chips' designs. To prevent infinite recursion (and a melted computer ^^' :3), nesting is limited to a maximum depth of 5 layers.
If a chip would exceed this depth, assembly will simply refuse to produce the final chip.